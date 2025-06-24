package AST;

import java.util.ArrayList;
import java.util.List;

public class ObjectInit implements ASTNode {
    private String className; // The IDENTIFIER (class name)
    private ObjectType objectType; // The optional objectType
    private List<ASTNode> arguments; // List of arguments (expressions)

    public ObjectInit(String className, ObjectType objectType) {
        this.className = className;
        this.objectType = objectType;
        this.arguments = new ArrayList<>();
    }

    public void addArgument(ASTNode argument) {
        this.arguments.add(argument);
    }

    public String getClassName() {
        return className;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return "\nObjectInit{" +
                "className='" + className + '\'' +
                ", objectType=" + (objectType != null ? objectType.toString() : "null") +
                ", arguments=" + arguments +
                "\n}";
    }
}
