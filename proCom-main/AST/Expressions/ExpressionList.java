

package AST.Expressions;

import AST.ASTNode;
import AST.ListStructure;

public class ExpressionList implements Expression {
    private ASTNode expression;
    private ListStructure list;

    public ExpressionList(ASTNode expression, ListStructure list) {
        this.expression = expression;
        this.list = list;
    }

    @Override
    public String toString() {
        return "\nExpressionList{"+expression + " " + list+"\n}";
    }
}
