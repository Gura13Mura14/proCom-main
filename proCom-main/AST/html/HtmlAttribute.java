package AST.html;

import AST.ASTNode;

public class HtmlAttribute implements ASTNode {
    private final String name;
    private final String value;

    public HtmlAttribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String toGrammarString(int indent) {
        String prefix = "  ".repeat(indent);
        StringBuilder sb = new StringBuilder();

        if (name.startsWith("*")) {
            sb.append(prefix).append("angularAttribute\n");
            sb.append(prefix).append("  HTML_STAR_BINDING: ").append(name).append("\n");
        } else {
            sb.append(prefix).append("htmlAttribute\n");
            sb.append(prefix).append("  HTML_ATTRIBUTE_NAME: ").append(name).append("\n");
            if (value != null) {
                sb.append(prefix).append("  HTML_EQUALS: =\n");
                sb.append(prefix).append("  HTML_ATTRIBUTE_VALUE: \"").append(value).append("\"\n");
            }
        }

        return sb.toString();
    }


    @Override
    public String toString() {
        return (value != null) ? name + "=\"" + value + "\"" : name;
    }

}
