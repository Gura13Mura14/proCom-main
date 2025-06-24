package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrowMethod implements ASTNode {
    private String modifier;
    private String name;
    private List<String> parameters = new ArrayList<>();
    private String returnType;
    private List<ASTNode> body = new ArrayList<>();
    private boolean hasArrow;

    public ArrowMethod() {}

    public ArrowMethod(Modifier modifier, String name, ParameterList parameters, String returnType) {
    }

    public void addParameter(String param) {
        if (param != null) {
            parameters.add(param);
        }
    }

    public void addBodyElement(ASTNode element) {
        if (element != null) {
            body.add(element);
        }
    }

    // --- Getters and Setters ---
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifier() {
        return modifier;
    }

    public boolean isAsync() {
        return "async".equals(modifier);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getReturnType() {
        return returnType;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public void setHasArrow(boolean hasArrow) {
        this.hasArrow = hasArrow;
    }

    public boolean hasArrow() {
        return hasArrow;
    }

    public String toInlineString() {
        StringBuilder sb = new StringBuilder();

        if (modifier != null) {
            sb.append(modifier).append(" ");
        }

        if (name != null) {
            sb.append(name);
        }

        sb.append("(").append(String.join(", ", parameters)).append(")");

        if (returnType != null) {
            sb.append(": ").append(returnType);
        }

        if (hasArrow) {
            sb.append(" => ");
        } else {
            sb.append(" ");
        }

        if (body.size() == 1 && !hasArrow) {
            sb.append(body.get(0));
        } else {
            sb.append("{").append(body).append("}");
        }

        return sb.toString();
    }


    public String toGrammarString(int indent) {
        String prefix = "  ".repeat(indent);
        StringBuilder sb = new StringBuilder();

        sb.append(prefix).append("arrowMethod\n");

        if (modifier != null) {
            sb.append(prefix).append("  MODIFIER: ").append(modifier).append("\n");
        }

        sb.append(prefix).append("  parameterList: (");
        sb.append(String.join(", ", parameters));
        sb.append(")\n");

        if (returnType != null) {
            sb.append(prefix).append("  RETURN_TYPE: ").append(returnType).append("\n");
        }

        if (hasArrow) {
            sb.append(prefix).append("  ARROW: =>\n");
        }

        sb.append(prefix).append("  body\n");
        for (ASTNode stmt : body) {
            if (stmt instanceof ASTNode) {
                sb.append(((ASTNode) stmt).toString()).append("\n");
            } else {
                sb.append(prefix).append("    ").append(stmt.toString()).append("\n");
            }
        }

        return sb.toString();
    }

}