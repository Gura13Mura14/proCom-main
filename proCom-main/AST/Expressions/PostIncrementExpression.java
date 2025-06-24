package AST.Expressions;




public class PostIncrementExpression implements Expression {
    private String identifier;

    public PostIncrementExpression(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "PostIncrementExpression{" + identifier + "++" + "}";
    }}
