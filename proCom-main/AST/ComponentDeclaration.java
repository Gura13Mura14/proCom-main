package AST;

import java.util.ArrayList;
import java.util.List;

public class ComponentDeclaration implements ASTNode {
    private Selector selector;
    private Standalone standalone;
    private Imports imports;
    private Url templateUrl;
    private Url styleUrl;
    private Template template;

    // Getters and setters
    public Selector getSelector() {
        return selector;
    }

    public void setSelector(Selector selector) {
        this.selector = selector;
    }

    public Standalone getStandalone() {
        return standalone;
    }

    public void setStandalone(Standalone standalone) {
        this.standalone = standalone;
    }

    public Imports getImports() {
        return imports;
    }

    public void setImports(Imports imports) {
        this.imports = imports;
    }

    public Url getTemplateUrl() {
        return templateUrl;
    }

    public void setTemplateUrl(Url templateUrl) {
        this.templateUrl = templateUrl;
    }

    public Url getStyleUrl() {
        return styleUrl;
    }

    public void setStyleUrl(Url styleUrl) {
        this.styleUrl = styleUrl;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    @Override
    public String toString() {
        return "\nComponentDeclaration{" +
                ((selector!=null)?"\n" +selector:"") +
                ((standalone!=null)?",\n" +standalone:"") +
                ((imports!=null)? ",\n" +imports:"") +
                ((templateUrl!=null)? ",\n" + templateUrl:"") +
                ((styleUrl!=null)? ",\n" +styleUrl:"") +
                ((template!=null)?",\n" +template:"") +
                "\n}";
    }
}
