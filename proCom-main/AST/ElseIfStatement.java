package AST;

public class ElseIfStatement implements ASTNode {
    private ASTNode condition; // The condition for the elseif
    private Block block; // The block to execute if the condition is true

    public ElseIfStatement(ASTNode condition, Block block) {
        this.condition = condition;
        this.block = block;
    }

    public ASTNode getCondition() {
        return condition;
    }

    public Block getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return "\nElseIfStatement{" +
                condition +
                block +
               "\n}";
    }
}
