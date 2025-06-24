package AST;

import java.util.ArrayList;
import java.util.List;

public class ScriptBlock implements ASTNode {
    private final List<ASTNode> statements = new ArrayList<>();

    public void addStatement(ASTNode statement) {
        if (statement != null) {
            statements.add(statement);
        }
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        return "ScriptBlock{" + statements + "}";
    }
}