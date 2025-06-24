package AST.jasmine;

import AST.ArrowMethod;

public class JasmineAfterEach extends JasmineStatement {
    private final ArrowMethod arrowMethod;

    public JasmineAfterEach(ArrowMethod arrowMethod) {
        this.arrowMethod = arrowMethod;
    }

    @Override
    public String toString() {
        return toGrammarString(0);
    }

    @Override
    public String toGrammarString(int indent) {
        String prefix = "  ".repeat(indent);
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append("jasmineAfterEach\n");
        sb.append(arrowMethod.toGrammarString(indent + 1));
        return sb.toString();
    }
}
