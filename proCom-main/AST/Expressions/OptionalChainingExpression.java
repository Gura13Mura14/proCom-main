package AST.Expressions;

import AST.ASTNode;

public class OptionalChainingExpression implements Expression{
    private ASTNode left;
    private ASTNode right;
    public OptionalChainingExpression(ASTNode left,ASTNode right) {
        this.left = left;
        this.right = right;
    }


    public ASTNode getLeft() {
        return left;
    }

    public ASTNode getRight() {
        return right;
    }

    @Override
    public String toString() {
        return"\nOptionalChainingExpression{"+ left + "." + right+"\n}";
    }
}
