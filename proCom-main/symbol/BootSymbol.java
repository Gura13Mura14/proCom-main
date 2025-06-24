package symbol;

import java.util.ArrayList;
import java.util.List;

public class BootSymbol {
    private final List<SemanticSymbol> symbols = new ArrayList<>();

    public void add(SemanticSymbol symbol) {
        symbols.add(symbol);
    }

    public List<SemanticSymbol> getAll() {
        return symbols;
    }

    public void printAll() {
        for (SemanticSymbol symbol : symbols) {
            System.out.println(symbol);
        }
    }

    public SemanticSymbol find(String name, String type) {
        for (SemanticSymbol symbol : symbols) {
            if (symbol.getName().equals(name) && symbol.getType().equals(type)) {
                return symbol;
            }
        }
        return null;
    }
}
