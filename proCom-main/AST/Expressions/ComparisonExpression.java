package AST.Expressions;


import AST.ASTNode;


public class ComparisonExpression implements Expression {
    private ASTNode left;
    private String operator;
    private ASTNode right;

    public ComparisonExpression(ASTNode left, String operator, ASTNode right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public String toString() {
        return "\nComparisonExpression{"+left + " " + operator + " " + right+"\n}";
    }
}
