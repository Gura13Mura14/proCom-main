package AST.html;

import AST.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement implements ASTNode {
    private String tagName;
    private List<HtmlAttribute> attributes = new ArrayList<>();
    private List<ASTNode> content = new ArrayList<>();

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public void setAttributes(List<HtmlAttribute> attributes) {
        this.attributes = attributes;
    }

    public void addContent(ASTNode node) {
        content.add(node);
    }

    public String getTagName() {
        return tagName;
    }

    public List<HtmlAttribute> getAttributes() {
        return attributes;
    }

    public List<ASTNode> getContent() {
        return content;
    }

    @Override
    public String toString() {
        return toGrammarString(0);
    }

    private String toGrammarString(int indent) {
        StringBuilder sb = new StringBuilder();
        String prefix = "  ".repeat(indent);

        sb.append(prefix).append("htmlElement\n");
        sb.append(prefix).append("  TAG_OPEN: <\n");
        sb.append(prefix).append("  HTML_TAG_NAME: ").append(tagName).append("\n");

        if (!attributes.isEmpty()) {
            sb.append(prefix).append("  htmlAttributes\n");
            for (HtmlAttribute attr : attributes) {
                sb.append(attr.toGrammarString(indent + 2));
            }
        }

        sb.append(prefix).append("  HTML_TAG_CLOSE: >\n");

        for (ASTNode node : content) {
            if (node instanceof HtmlElement) {
                sb.append(((HtmlElement) node).toGrammarString(indent + 1));
            } else if (node instanceof Interpolation) {
                sb.append(prefix).append("  htmlContent\n");
                sb.append(((Interpolation) node).toGrammarString(indent + 2));
            } else if (node instanceof TextNode) {
                sb.append(prefix).append("  htmlContent\n");
                sb.append(((TextNode) node).toGrammarString(indent + 2));
            }
        }

        sb.append(prefix).append("  htmlClosingTag\n");
        sb.append(prefix).append("    TAG_OPEN: </\n");
        sb.append(prefix).append("    HTML_TAG_NAME: ").append(tagName).append("\n");
        sb.append(prefix).append("    HTML_TAG_CLOSE: >\n");

        return sb.toString();
    }


}
