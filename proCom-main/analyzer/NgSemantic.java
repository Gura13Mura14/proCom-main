package analyzer;

import AST.*;
import symbol.SemanticSymbol;
import symbol.NgSymbol;

import java.util.*;

public class NgSemantic {

    private static final NgSymbol symbolTable = new NgSymbol();

    public void analyzeNgModule(NgModuleNode node, int line, int column) {
        ObjectLiteral config = node.getConfig();
        Set<String> declarations = new HashSet<>();
        Set<String> imports = new HashSet<>();

        for (Property prop : config.getProperties()) {
            String name = prop.getName();
            if (name.equals("declarations")) {
                declarations.addAll(extractIdentifiers(prop));
            } else if (name.equals("imports")) {
                imports.addAll(extractIdentifiers(prop));
            }
        }

        // خزّن رموز الـ declarations
        for (String decl : declarations) {
            SemanticSymbol symbol = new SemanticSymbol(decl, "Declaration", decl, line, column, null);
            symbolTable.add(symbol);
        }

        // خزّن الـ imports وافحص التكرار
        for (String imp : imports) {
            SemanticSymbol existing = symbolTable.find(imp, "Declaration");

            if (existing != null) {
                // مكرر في declarations → خطأ
                SemanticSymbol duplicate = new SemanticSymbol(imp, "Import", imp, line, column, "DuplicateInDeclarationsAndImports");
                symbolTable.add(duplicate);


                throw new SemanticException(
                        String.format(
                                "❗ Semantic Error: Component '%s' found in both declarations and imports.\n" +
                                        " - Declared at line" + line+ " column"+ column +
                                        " - Re-imported at line " + line+ "  column "+ column ,
                                imp,
                                existing.getLine(), existing.getColumn(),
                                line, column
                        )
                );
            }

            // لا يوجد تكرار → خزّنه بشكل طبيعي
            SemanticSymbol symbol = new SemanticSymbol(imp, "Import", imp, line, column, null);
            symbolTable.add(symbol);
        }
    }

    public NgSymbol getSymbolTable() {
        return symbolTable;
    }

    private List<String> extractIdentifiers(ASTNode node) {
        List<String> result = new ArrayList<>();

        if (node == null) return result;

        if (node instanceof Imports importsNode) {
            result.addAll(importsNode.getImports());
        } else if (node instanceof Property propNode) {
            result.addAll(extractIdentifiers(propNode.getValue()));
        } else if (node instanceof DataStructure dataStructure) {
            ASTNode structure = dataStructure.getStructure();
            if (structure instanceof ListStructure listStructure) {
                for (ItemsStructures item : listStructure.getItems()) {
                    Object val = item.getStructure();
                    if (val instanceof String strVal) {
                        result.add(strVal);
                    } else if (val instanceof ASTNode astNode) {
                        result.addAll(extractIdentifiers(astNode));
                    }
                }
            }
        }

        return result;
    }
}
