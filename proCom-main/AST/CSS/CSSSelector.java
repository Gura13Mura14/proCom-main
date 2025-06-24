package AST.CSS;

import AST.ASTNode;

import java.util.List;

public class CSSSelector implements ASTNode {
    private List<SimpleSelector> selectors;

    public CSSSelector(List<SimpleSelector> selectors) {
        this.selectors = selectors;
    }

    public List<SimpleSelector> getSelectors() {
        return selectors;
    }

    @Override
    public String toString() {
        return "CSSSelector{" + selectors + "}";
    }
}