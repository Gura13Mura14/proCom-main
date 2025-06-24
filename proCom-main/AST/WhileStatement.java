package AST;

public class WhileStatement implements ASTNode {
    private ASTNode condition; // The condition of the while loop
    private Block block;       // The block of statements to execute

    public WhileStatement(ASTNode condition, Block block) {
        this.condition = condition;
        this.block = block;
    }

    public ASTNode getCondition() {
        return condition;
    }

    public void setCondition(ASTNode condition) {
        this.condition = condition;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "\nWhileStatement{" +
                "\ncondition=" + condition +
                "\nblock=" + block +
                "\n}";
    }
}
