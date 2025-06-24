package symbol;

import AST.CSS.*;

public class CSSSymbolTableBuilder {

    public CSSSymbolTable build(StyleBlock styleBlock) {
        CSSSymbolTable symbolTable = new CSSSymbolTable();

        for (CSSRule rule : styleBlock.getRules()) {
            StringBuilder selectorName = new StringBuilder();

            for (SimpleSelector sel : rule.getSelector().getSelectors()) {
                selectorName.append(switch (sel.getType()) {
                    case CLASS -> ".";
                    case ID -> "#";
                    case ELEMENT -> "";
                }).append(sel.getName()).append(" ");
            }

            String selectorKey = selectorName.toString().trim();

            for (CSSDeclaration declaration : rule.getDeclarations()) {
                String property = declaration.getProperty();
                String value = String.join(" ", declaration.getValues());
                symbolTable.add(selectorKey, property, value);
            }
        }

        return symbolTable;
    }
}