package AST.Expressions;


import AST.ASTNode;


public class GenericTypeExpression implements Expression {
    private ASTNode expression;
    private String typeIdentifier;

    public GenericTypeExpression(ASTNode expression, String typeIdentifier) {
        this.expression = expression;
        this.typeIdentifier = typeIdentifier;
    }

    public ASTNode getExpression() {
        return expression;
    }

    public String getTypeIdentifier() {
        return typeIdentifier;
    }

    @Override
    public String toString() {
        return "\nGenericTypeExpression{" +
                expression +
                ", typeIdentifier='" + typeIdentifier + '\'' +
                "\n}";
    }
}
