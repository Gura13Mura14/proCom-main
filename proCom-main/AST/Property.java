package AST;

public class Property implements ASTNode {
    private String name; // Property name (IDENTIFIER)
    private ASTNode value; // The value, which could be an expression or imports


    public Property(String name, ASTNode value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public ASTNode getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "\nProperty{" +
                "name=" + name +
                ", value=" + value +
                "\n}";
    }
}
