package AST;

public class OutputDeclaration implements ASTNode {
    private Literal literal;        // Optional literal (expression)
    private ObjectDeclaration objectDeclaration;  // Object declaration (from objectDecleration)

    public OutputDeclaration(Literal literal, ObjectDeclaration objectDeclaration) {
        this.literal = literal;
        this.objectDeclaration = objectDeclaration;
    }

    public Literal getLiteral() {
        return literal;
    }

    public ObjectDeclaration getObjectDeclaration() {
        return objectDeclaration;
    }

    @Override
    public String toString() {
        return "\nOutputDeclaration{" +
                  "literal=" +  literal +
                ", objectDeclaration=" + objectDeclaration +
                "\n}";
    }
}
