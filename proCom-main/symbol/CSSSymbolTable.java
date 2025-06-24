package symbol;

import java.util.*;

public class CSSSymbolTable {

    private Map<String, Map<String, String>> selectorTable = new HashMap<>();
    private Set<String> elementSelectors = new HashSet<>();
    private Set<String> classSelectors = new HashSet<>();
    private Set<String> idSelectors = new HashSet<>();

    public void add(String selector, String property, String value) {
        selectorTable
                .computeIfAbsent(selector, k -> new HashMap<>())
                .put(property, value);
    }

    public void addElementSelector(String name) {
        elementSelectors.add(name);
    }

    public void addClassSelector(String name) {
        classSelectors.add(name);
    }

    public void addIdSelector(String name) {
        idSelectors.add(name);
    }

    public Map<String, Map<String, String>> getSelectorTable() {
        return selectorTable;
    }

    public Set<String> getElementSelectors() {
        return elementSelectors;
    }

    public Set<String> getClassSelectors() {
        return classSelectors;
    }

    public Set<String> getIdSelectors() {
        return idSelectors;
    }

    public void printSymbolTable() {
        System.out.println("🔹 Classes: " + classSelectors);
        System.out.println("🔹 IDs: " + idSelectors);
        System.out.println("🔹 Elements: " + elementSelectors);
    }
}