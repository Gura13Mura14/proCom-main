package AST;

public class Literal implements ASTNode {
    private Object value;
    private String type;

    public Literal(Object value, String type) {
        this.value = value;
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\nLiteral{" +
                "value=" + value +
                ", type='" + type + '\'' +
                '}';
    }
}
