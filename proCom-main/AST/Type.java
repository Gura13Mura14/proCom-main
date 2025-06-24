package AST;

public class Type implements ASTNode {
    private String type; // The type can be CONST, LET, or VAR

    public Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\nType{" +
                 type +
                "\n}";
    }
}