package symbol;

import java.util.HashMap;
import java.util.Map;

public class ComponentSymbol {

        private final Map<String, SemanticSymbol> components = new HashMap<>();

        public void define(SemanticSymbol symbol) {
            components.put(symbol.name, symbol);
        }

        public SemanticSymbol resolve(String name) {
            return components.get(name);
        }

        public Map<String, SemanticSymbol> getAll() {
            return components;
        }

        public void printAll() {
            for (SemanticSymbol symbol : components.values()) {
                System.out.println(symbol);
            }
        }
    }




