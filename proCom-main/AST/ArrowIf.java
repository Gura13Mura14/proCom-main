package AST;

import AST.Expressions.Expression;

public class ArrowIf implements ASTNode {
    private Expression condition;  // The expression before the ARROW
    private Expression result;     // The expression after the ARROW

    public ArrowIf(Expression condition, Expression result) {
        this.condition = condition;
        this.result = result;
    }

    public Expression getCondition() {
        return condition;
    }

    public Expression getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "\nArrowIf{" +
              condition +
               result +
                "\n}";
    }
}
