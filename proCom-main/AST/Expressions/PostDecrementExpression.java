package AST.Expressions;




public class PostDecrementExpression implements Expression {
    private String identifier;

    public PostDecrementExpression(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return"PostDecrementExpression{"+ identifier + "--" +"}";
    }
}
