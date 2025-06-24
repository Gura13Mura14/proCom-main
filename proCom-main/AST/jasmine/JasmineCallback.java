package AST.jasmine;

import AST.ASTNode;
import java.util.List;
import java.util.ArrayList;

public class JasmineCallback implements ASTNode {
    private final boolean isAsync;
    private final List<String> parameters;
    private final List<JasmineStatement> statements;

    public JasmineCallback(boolean isAsync, List<String> parameters, List<JasmineStatement> statements) {
        this.isAsync = isAsync;
        this.parameters = parameters;
        this.statements = statements;
    }

    public boolean isAsync() {
        return isAsync;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public List<JasmineStatement> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        return toGrammarString(0);
    }

    public String toGrammarString(int indent) {
        String prefix = "  ".repeat(indent);
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append("jasmineCallback\n");
        if (isAsync) sb.append(prefix).append("  ASYNC\n");
        sb.append(prefix).append("  parameterList: ").append(parameters).append("\n");
        for (JasmineStatement stmt : statements) {
            sb.append(stmt.toGrammarString(indent + 1));
        }
        return sb.toString();
    }
}
