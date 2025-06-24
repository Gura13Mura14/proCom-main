package AST.Expressions;

import AST.ASTNode;

public class ReturnExp implements Expression {
    private ASTNode returnStatement;

    public ReturnExp(ASTNode returnStatement) {
        this.returnStatement = returnStatement;
    }

    @Override
    public String toString() {
        return "ReturnExp{\n" + returnStatement + "\n}";
    }
}
