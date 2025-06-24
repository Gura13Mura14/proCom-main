package AST.Expressions;

import AST.ASTNode;


public class OperatorExpression implements Expression {
    private ASTNode left;
    private String operator;
    private ASTNode right;

    public OperatorExpression(ASTNode left, String operator, ASTNode right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public String toString() {
        return "OperatorExpression{"+left + " " + operator + " " + right+"}";
    }
}
