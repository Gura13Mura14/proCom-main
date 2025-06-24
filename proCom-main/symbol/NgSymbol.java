package symbol;

import java.util.ArrayList;
import java.util.List;

public class NgSymbol {

    private final List<SemanticSymbol> moduleComponents = new ArrayList<>();

    public void add(SemanticSymbol symbol) {
        moduleComponents.add(symbol);
    }

    public List<SemanticSymbol> getAll() {
        return moduleComponents;
    }

    public void printAll() {
        for (SemanticSymbol symbol : moduleComponents) {
            System.out.println(symbol);
        }
    }

    public SemanticSymbol find(String name, String type) {
        for (SemanticSymbol symbol : moduleComponents) {
            if (symbol.getName().equals(name) && symbol.getType().equals(type)) {
                return symbol;
            }
        }
        return null;
    }
}
