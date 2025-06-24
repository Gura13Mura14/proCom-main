package AST.CSS;

import AST.ASTNode;

public class SimpleSelector implements ASTNode {
    public enum SelectorType { CLASS, ID, ELEMENT }

    private SelectorType type;
    private String name;

    public SimpleSelector(SelectorType type, String name) {
        this.type = type;
        this.name = name;
    }

    public SelectorType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SimpleSelector{" + type + "='" + name + "'}";
    }
}