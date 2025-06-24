package AST;

public class Parameter implements ASTNode {
    private String name;

    public Parameter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
