package AST.Expressions;


import AST.ASTNode;


public class TypeCastExpression implements Expression {
    private ASTNode expression;
    private String typeIdentifier;

    public TypeCastExpression(ASTNode expression, String typeIdentifier) {
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
        return "\nTypeCastExpression{" +
               expression +
                ", typeIdentifier='" + typeIdentifier + '\'' +
                "\n}";
    }
}
