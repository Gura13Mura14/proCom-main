package AST;

public class Selector implements ASTNode {
    private String selector;

    public Selector(String selector) {
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }

    @Override
    public String toString() {
        return "\nSelector{" +
                selector +
                "\n}";
    }
}
