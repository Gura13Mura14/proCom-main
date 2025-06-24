package AST.jasmine;

import AST.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class JasmineDescribe implements ASTNode {
    private final String description;
    private final JasmineCallback callback;

    public JasmineDescribe(String description, JasmineCallback callback) {
        this.description = description;
        this.callback = callback;
    }

    public String getDescription() {
        return description;
    }

    public JasmineCallback getCallback() {
        return callback;
    }

    @Override
    public String toString() {
        return toGrammarString(0);
    }

    public String toGrammarString(int indent) {
        String prefix = "  ".repeat(indent);
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append("jasmineDescribe\n");
        sb.append(prefix).append("  DESCRIBE: \"").append(description).append("\"\n");
        sb.append(callback.toGrammarString(indent + 1));
        return sb.toString();
    }
}
