package AST.CSS;

import AST.ASTNode;

import java.util.List;

public class CSSDeclarations implements ASTNode {
    private List<CSSDeclaration> declarations;

    public CSSDeclarations(List<CSSDeclaration> declarations) {
        this.declarations = declarations;
    }

    public List<CSSDeclaration> getDeclarations() {
        return declarations;
    }

    @Override
    public String toString() {
        return "CSSDeclarations{" + declarations + "}";
    }
}