package AST;

import AST.jasmine.*;
import java.util.ArrayList;
import java.util.List;

public class Program implements ASTNode {
    private final List<ASTNode> body = new ArrayList<>();

    public void addElement(ASTNode element) {
        if (element != null) {
            this.body.add(element);
        }
    }

    public List<ASTNode> getBody() {
        return body;
    }

    @Override
    public String toString() {
        return toGrammarString(0); // حتى يبقى toString يعمل بنفس الشكل
    }

    public String toGrammarString(int indent) {
        String prefix = "  ".repeat(indent);
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append("program\n");
        for (ASTNode element : body) {
            if (element instanceof ASTNode) {
                if (element instanceof JasmineStatement jsStmt) {
                    sb.append(jsStmt.toGrammarString(indent + 1));
                } else if (element instanceof JasmineDescribe jd) {
                    sb.append(jd.toGrammarString(indent + 1));
                } else if (element instanceof ArrowMethod am) {
                    sb.append(am.toGrammarString(indent + 1));
                } else if (element instanceof Statement st && st.getStatement() != null) {
                    sb.append(prefix).append("  statement\n");
                    sb.append(st.getStatement().toString()).append("\n"); // أو toGrammarString لو متوفرة
                } else {
                    sb.append(prefix).append("  ").append(element.toString()).append("\n");
                }
            }
        }
        return sb.toString();
    }

}
