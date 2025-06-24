package AST.CSS;

import AST.ASTNode;

import java.util.List;

public class CSSRules implements ASTNode {
    private List<CSSRule> rules;

    public CSSRules(List<CSSRule> rules) {
        this.rules = rules;
    }

    public List<CSSRule> getRules() {
        return rules;
    }

    @Override
    public String toString() {
        return "CSSRules{\n" + rules + "\n}";
    }
}