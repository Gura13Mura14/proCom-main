package AST;

public class ForStatement implements ASTNode {
    private ASTNode initializer; // Initialization (variable declaration or expression)
    private ASTNode condition;   // Condition expression
    private ASTNode increment;   // Increment expression
    private Block block;         // Loop body

    public ForStatement(ASTNode initializer, ASTNode condition, ASTNode increment, Block block) {
        this.initializer = initializer;
        this.condition = condition;
        this.increment = increment;
        this.block = block;
    }

    public ASTNode getInitializer() {
        return initializer;
    }

    public void setInitializer(ASTNode initializer) {
        this.initializer = initializer;
    }

    public ASTNode getCondition() {
        return condition;
    }

    public void setCondition(ASTNode condition) {
        this.condition = condition;
    }

    public ASTNode getIncrement() {
        return increment;
    }

    public void setIncrement(ASTNode increment) {
        this.increment = increment;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "\nForStatement{" +
               initializer +
               condition +
                 increment +
                block +
                "\n}";
    }
}
