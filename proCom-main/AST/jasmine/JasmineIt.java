package AST.jasmine;


import AST.ArrowMethod;

public class JasmineIt extends JasmineStatement {
    private final String description;
    private final String optionalId;
    private final String optionalString;
    private final AST.ArrowMethod arrowMethod;

    public JasmineIt(String description, String optionalId, String optionalString, ArrowMethod arrowMethod) {
        this.description = description;
        this.optionalId = optionalId;
        this.optionalString = optionalString;
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
        sb.append(prefix).append("jasmineIt\n");
        sb.append(prefix).append("  IT: \"").append(description).append("\"\n");
        if (optionalId != null) sb.append(prefix).append("  IDENTIFIER: ").append(optionalId).append("\n");
        if (optionalString != null) sb.append(prefix).append("  String: ").append(optionalString).append("\n");
        sb.append(arrowMethod.toGrammarString(indent + 1));
        return sb.toString();
    }
}
