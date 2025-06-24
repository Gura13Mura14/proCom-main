package AST.Expressions;




public class IdentifierExpression implements Expression {
    private String name;

    public IdentifierExpression(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nIdentifierExpression{"+name+"\n}";
    }
}
