package AST;

public class DataStructure implements ASTNode {
    private ASTNode structure; // Can be ListStructure or MapStructure

    public DataStructure(ASTNode structure) {
        this.structure = structure;
    }

    public ASTNode getStructure() {
        return structure;
    }

    @Override
    public String toString() {
        return "\nDataStructure{" +
                structure +
                "\n}";
    }
}
