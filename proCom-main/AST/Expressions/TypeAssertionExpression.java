package AST.Expressions;

import AST.ASTNode;

public class TypeAssertionExpression implements Expression{
    private ASTNode expression;
    private String typeIdentifier;

    public TypeAssertionExpression(ASTNode expression, String typeIdentifier) {
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
        return "\nTypeAssertionExpression{" +
                expression +
                ", typeIdentifier='" + typeIdentifier + '\'' +
                "\n}";
    }
}
