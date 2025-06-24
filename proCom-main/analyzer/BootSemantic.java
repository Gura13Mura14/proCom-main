package analyzer;

import AST.*;
import symbol.BootSymbol;
import symbol.SemanticSymbol;

import java.util.*;

public class BootSemantic {

    // إنشاء الجدول الرمزي كمتغير عضو
    private final BootSymbol symbolTable = new BootSymbol();

    public void analyzeboot(NgModuleNode node, int line, int column) {
        ObjectLiteral config = node.getConfig();
        Set<String> declarations = new HashSet<>();
        Set<String> bootstrap = new HashSet<>();

        for (Property prop : config.getProperties()) {
            String name = prop.getName();
            if (name.equals("declarations")) {
                declarations.addAll(extractIdentifiers(prop));
            } else if (name.equals("bootstrap")) {
                bootstrap.addAll(extractIdentifiers(prop));
            }
        }

        // تخزين الرموز من declarations
        for (String decl : declarations) {
            symbolTable.add(new SemanticSymbol(decl, "Declaration", decl, line, column, null));
        }

        // تخزين bootstrap والتحقق من الخطأ
        for (String comp : bootstrap) {
            if (!declarations.contains(comp)) {
                // خطأ: مكون موجود في bootstrap ولكنه غير موجود في declarations
                SemanticSymbol errorSymbol = new SemanticSymbol(
                        comp, "Bootstrap", comp, line, column, "MissingInDeclarations"
                );
                symbolTable.add(errorSymbol);

                // طباعة الجدول الرمزي عند حدوث خطأ

                throw new SemanticException(
                        String.format(
                                "❗ Semantic Error: Component '%s' is in bootstrap but not declared in declarations.\n" +
                                        " - Error at line " + line+ " column "+ column,
                                comp, line, column
                        )
                );
            }

            // مكون موجود في كلاهما
            symbolTable.add(new SemanticSymbol(comp, "Bootstrap", comp, line, column, null));
        }
    }

    public BootSymbol getSymbolTable() {
        return symbolTable;
    }

    private List<String> extractIdentifiers(ASTNode node) {
        List<String> result = new ArrayList<>();
        if (node == null) return result;

        if (node instanceof Property propNode) {
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
