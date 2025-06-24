package AST.CSS;

import AST.ASTNode;
import java.util.List;

public class CSSDeclaration implements ASTNode {
    private String property;
    private List<String> values;

    public CSSDeclaration(String property, List<String> values) {
        this.property = property;
        this.values = values;
    }

    public String getProperty() {
        return property;
    }

    public List<String> getValues() {
        return values;
    }

    @Override
    public String toString() {
        return property + ": " + values;
    }
}
