package AST;

public class Standalone implements ASTNode {
    private boolean value;

    public Standalone(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "\nStandalone{" +
                value +
                "\n}";
    }
}
