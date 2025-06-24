package AST;

public class Operator implements ASTNode {
    private String operator;

    public Operator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return "\nOperator{" +
             operator  +
                "\n}";
    }
}
