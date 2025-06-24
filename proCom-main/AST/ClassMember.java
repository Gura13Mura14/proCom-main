package AST;

public class ClassMember implements ASTNode {
    private ASTNode member; // Represents any of the possible class member types

    public ClassMember(ASTNode member) {
        this.member = member;
    }

    public ASTNode getMember() {
        return member;
    }

    @Override
    public String toString() {
        return "\nClassMember{" +
                member +
                "}";
    }
}
