package analyzer;

import AST.CSS.*;
import symbol.CSSSymbolTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CSSSemanticAnalyzer {

    private static final Set<String> VALID_HTML_ELEMENTS = new HashSet<>(Arrays.asList(
            "div", "span", "p", "ul", "li", "img", "a", "input", "form", "button", "section", "article",
            "nav", "header", "footer", "main", "aside", "h1", "h2", "h3", "h4", "h5", "h6"
    ));

    private CSSSymbolTable symbolTable;
    private Set<String> knownComponentTags;
    private Set<String> knownClassNames;
    private Set<String> knownIds;


    public CSSSemanticAnalyzer(Set<String> knownComponentTags,
                               Set<String> knownClassNames,
                               Set<String> knownIds,
                               CSSSymbolTable symbolTable) {
        this.knownComponentTags = knownComponentTags;
        this.knownClassNames = knownClassNames;
        this.knownIds = knownIds;
        this.symbolTable = symbolTable;
    }


    public void analyze(StyleBlock styleBlock) {
        for (CSSRule rule : styleBlock.getRules()) {
            CSSSelector selector = rule.getSelector();

            for (SimpleSelector simpleSelector : selector.getSelectors()) {
                String name = simpleSelector.getName();

                switch (simpleSelector.getType()) {
                    case ELEMENT:
                        if (!VALID_HTML_ELEMENTS.contains(name) && !knownComponentTags.contains(name)) {
                            reportSemanticError("Unknown element selector: '" + name + "'");
                        }
                        symbolTable.addElementSelector(name);
                        break;

                    case CLASS:
                        if (!name.startsWith(".")) {
                            reportSemanticError("Class selector must start with '.', found: '" + name + "'");
                        } else {
                            String className = name.substring(1); // remove '.'
                            symbolTable.addClassSelector(className);

                            if (!knownClassNames.contains(className)) {
                                reportSemanticError("Class selector '."
                                        + className + "' is not defined in any known HTML or component.");
                            }
                        }
                        break;

                    case ID:
                        if (!name.startsWith("#")) {
                            reportSemanticError("ID selector must start with '#', found: '" + name + "'");
                        } else {
                            String idName = name.substring(1); // remove '#'
                            symbolTable.addIdSelector(idName);

                            if (!knownIds.contains(idName)) {
                                reportSemanticError("ID selector '#"
                                        + idName + "' is not defined in any known HTML or component.");
                            }
                        }
                        break;
                }
            }
        }
    }


    private void reportSemanticError(String message) {
        System.err.println("[Semantic Error] " + message);
    }
}