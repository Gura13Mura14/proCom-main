package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration implements ASTNode {
    private ASTNode modifier; // Optional modifier (e.g., public, private, etc.)
    private String name; // Class name
    private String parentOrInterface; // Optional parent or interface
    private List<ClassMember> members; // List of class members

    public ClassDeclaration(ASTNode modifier, String name, String parentOrInterface) {
        this.modifier = modifier;
        this.name = name;
        this.parentOrInterface = parentOrInterface;
        this.members = new ArrayList<>();
    }

    public void addMember(ClassMember member) {
        members.add(member);
    }

    @Override
    public String toString() {
        return "ClassDeclaration{" +
               modifier + '\'' +
                ", name='" + name + '\'' +
                ", parentOrInterface='" + parentOrInterface + '\'' +
                   "\nmembers:" +    members +
                "\n}";
    }
}
