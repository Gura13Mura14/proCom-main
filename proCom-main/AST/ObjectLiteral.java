package AST;

import java.util.ArrayList;
import java.util.List;

public class ObjectLiteral implements ASTNode {
    private List<Property> properties; // List of properties in the object literal

    public ObjectLiteral() {
        this.properties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        this.properties.add(property);
    }

    public List<Property> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return "\nObjectLiteral{" +
                "properties=" + properties +
                "\n}";
    }
}
