package AST;

public class PropertyDeclaration implements ASTNode {
    private Modifier modifier; // Optional modifier
    private Property property; // The property
    private ASTNode value;     // Optional assigned value (expression)
    private String type;

    public PropertyDeclaration(Modifier modifier, Property property, ASTNode value,String type) {
        this.modifier = modifier;
        this.property = property;
        this.value = value;
        this.type = type;
    }

    public Modifier getModifier() {
        return modifier;
    }

    public Property getProperty() {
        return property;
    }

    public ASTNode getValue() {
        return value;
    }
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return "\nPropertyDeclaration{" +
                 "\nmodifier=" + modifier+
                ", \nproperty=" + property +
             ",\n value=" +  value +
                (type != null ? ", \ntype='" + type + '\'' : "") +
                "\n}";
    }
}
