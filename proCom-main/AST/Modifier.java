package AST;

public class Modifier implements ASTNode{

    private String type;

    public Modifier(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\nModifier{" +
                type +
                '}';
    }
}
