package AST.html;

import AST.ASTNode;

public class TextNode implements ASTNode {
    private final String text;

    public TextNode(String text) {
        this.text = text;
    }
    public String toGrammarString(int indent) {
        String prefix = "  ".repeat(indent);
        return prefix + "TEXT: \"" + text + "\"\n";
    }

    @Override
    public String toString() {
        return "Text: \"" + text + "\"";
    }

}
