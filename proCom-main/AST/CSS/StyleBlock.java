package AST.CSS;

import AST.ASTNode;

import java.util.List;

public class StyleBlock implements ASTNode {
    private List<CSSRule> rules;

    public StyleBlock(List<CSSRule> rules) {
        this.rules = rules;
    }

    public List<CSSRule> getRules() {
        return rules;
    }

    @Override
    public String toString() {
        return "StyleBlock{\n" + rules + "\n}";
    }
}