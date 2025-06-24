package AST;

import AST.Expressions.Expression;

public class ShortElseIf implements ASTNode {
    private Expression expression; // The condition expression
    private Statement statement;   // The statement that follows the condition

    public ShortElseIf(Expression expression, Statement statement) {
        this.expression = expression;
        this.statement = statement;
    }

    public Expression getExpression() {
        return expression;
    }

    public Statement getStatement() {
        return statement;
    }

    @Override
    public String toString() {
        return "\nShortElseIf{" +
                "expression=" + expression +
                ", statement=" + statement +
                "\n}";
    }
}
