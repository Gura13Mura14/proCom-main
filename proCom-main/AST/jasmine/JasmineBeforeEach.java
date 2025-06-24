package AST.jasmine;

import AST.ArrowMethod;

public class JasmineBeforeEach extends JasmineStatement {
    private final ArrowMethod arrowMethod;

    public JasmineBeforeEach(ArrowMethod arrowMethod) {
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
        sb.append(prefix).append("jasmineBeforeEach\n");
        sb.append(arrowMethod.toGrammarString(indent + 1));
        return sb.toString();
    }
}
