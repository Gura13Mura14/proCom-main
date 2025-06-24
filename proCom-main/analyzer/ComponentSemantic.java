package analyzer;

import AST.ComponentDeclaration;
import com.sun.tools.javac.Main;
import symbol.SemanticSymbol;
import visitor.BaseVisitor;

import java.util.ArrayList;
import java.util.List;

import static visitor.BaseVisitor.symbolTable;

public class ComponentSemantic {


    public void analyze(ComponentDeclaration component, int line, int col) {
        // ✅ أضف كل الحقول إلى الجدول، حتى لو كانت null
        addSymbol("selector", "Selector", (component.getSelector() != null) ? component.getSelector().toString() : null,
                line, col, (component.getSelector() == null) ? "MissingProperty" : null);

        boolean hasTemplate = component.getTemplate() != null;
        boolean hasTemplateUrl = component.getTemplateUrl() != null;

        addSymbol("templateUrl", "Url", hasTemplateUrl ? component.getTemplateUrl().toString() : null,
                line, col, (!hasTemplate && !hasTemplateUrl) ? "MissingProperty" : null);

        addSymbol("template", "Template", hasTemplate ? component.getTemplate().toString() : null,
                line, col, (!hasTemplate && !hasTemplateUrl) ? "MissingProperty" : null);

        addSymbol("styleUrl", "Url", (component.getStyleUrl() != null) ? component.getStyleUrl().toString() : null,
                line, col, (component.getStyleUrl() == null) ? "MissingProperty" : null);

        addSymbol("imports", "Imports", (component.getImports() != null) ? component.getImports().toString() : null,
                line, col, null);

        addSymbol("standalone", "Standalone", (component.getStandalone() != null) ? component.getStandalone().toString() : null,
                line, col, null);

        if (!hasTemplate && !hasTemplateUrl || component.getSelector() == null || component.getStyleUrl() == null) {
            throw new SemanticException("❌ Semantic Error: Missing required component properties at line " + line + ", column " + col);
        }

        if (hasTemplate && hasTemplateUrl) {
            System.err.println("⚠️ Warning: Component has both template and templateUrl — only one is recommended.");
        }
    }

    private void addSymbol(String name, String type, String value, int line, int column, String errorType) {
        symbolTable.add(new SemanticSymbol(name, type, value, line, column, errorType));
    }

    public List<SemanticSymbol> getSymbolTable() {
        return symbolTable;
    }
    public  void printSymbolTableAsTable(List<SemanticSymbol> table) {
        String format = "| %-12s | %-10s | %-25s | %-4s | %-6s | %-15s |%n";
        String line = "+--------------+------------+---------------------------+------+--------+-----------------+";

        System.out.println(line);
        System.out.printf(format, "Name", "Type", "Value", "Line", "Col", "ErrorType");
        System.out.println(line);

        for (SemanticSymbol symbol : table) {
            System.out.printf(format,
                    symbol.getName(),
                    symbol.getType(),
                    (symbol.getValue() != null ? symbol.getValue() : "null"),
                    symbol.getLine(),
                    symbol.getColumn(),
                    (symbol.getErrorType() != null ? symbol.getErrorType() : "null")
            );
        }

        System.out.println(line);
    }

}
