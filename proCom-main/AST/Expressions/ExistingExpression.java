package AST.Expressions;

import AST.ASTNode;

public class ExistingExpression implements Expression{
    public ASTNode expression;

    public ExistingExpression(ASTNode expression) {
        this.expression = expression;
    }
}
