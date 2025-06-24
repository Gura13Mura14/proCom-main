package AST;

public class Comparison implements ASTNode {
    private String comparison;

    public Comparison(String comparison) {
        this.comparison = comparison;
    }

    public String getComparison() {
        return comparison;
    }

    @Override
    public String toString() {
        return "\nComparison{" +
                comparison +
                "\n}";
    }
}
