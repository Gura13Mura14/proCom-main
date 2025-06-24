package AST.CSS;

import AST.ASTNode;

import java.util.List;

public class CSSRule implements ASTNode {
    private CSSSelector selector;
    private List<CSSDeclaration> declarations;

    public CSSRule(CSSSelector selector, List<CSSDeclaration> declarations) {
        this.selector = selector;
        this.declarations = declarations;
    }

    public CSSSelector getSelector() {
        return selector;
    }

    public List<CSSDeclaration> getDeclarations() {
        return declarations;
    }

    @Override
    public String toString() {
        return "CSSRule{\nselector=" + selector + ",\ndeclarations=" + declarations + "\n}";
    }
}