package AST.html;

import AST.ASTNode;

public class Interpolation implements ASTNode {
    private final String expression;

    public Interpolation(String expression) {
        this.expression = expression;
    }

    public String toGrammarString(int indent) {
        String prefix = "  ".repeat(indent);
        return prefix + "HTML_INTERPOLATION: {{ " + expression + " }}\n";
    }

    @Override
    public String toString() {
        return "Interpolation: " + expression;
    }

}
