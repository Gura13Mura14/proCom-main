package AST;

import java.util.ArrayList;
import java.util.List;

public class Block implements ASTNode {
    private List<Statement> statements; // List of statements
    private ReturnStatement returnStatement;

    public Block() {
        this.statements =new ArrayList<>();
    }
    public   void addStatment(Statement statement){
        this.statements.add(statement);

    }
    public List<Statement> getStatements() {
        return statements;
    }


    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    @Override
    public String toString() {
        return "\nBlock{" +
                statements +
                ( returnStatement!=null? returnStatement.toString() :"" )+
                "\n}";
    }
}
