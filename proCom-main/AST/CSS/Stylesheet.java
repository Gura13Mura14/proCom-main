package AST.CSS;

import AST.ASTNode;
import java.util.List;

public class Stylesheet implements ASTNode {
    private List<CSSRule> rules;

    public Stylesheet(List<CSSRule> rules) {
        this.rules = rules;
    }

    public List<CSSRule> getRules() {
        return rules;
    }

    @Override
    public String toString() {
        return "Stylesheet{\n" + rules + "\n}";
    }
}
