package AST;

public class ExpressionStatement implements ASTNode {
    private ASTNode expression;

    public ExpressionStatement(ASTNode expression) {
        this.expression = expression;
    }

    public ASTNode getExpression() {
        return expression;
    }

    public void setExpression(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nExpressionStatement{" +
                expression +
                "\n}";
    }
}
