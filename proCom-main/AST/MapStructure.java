package AST;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapStructure implements ASTNode {
    private Map<ItemsStructures, ItemsStructures> entries;

    public MapStructure() {
        this.entries = new LinkedHashMap<>();
    }

    public void addEntry(ItemsStructures key, ItemsStructures value) {
        this.entries.put(key, value);
    }

    public Map<ItemsStructures, ItemsStructures> getEntries() {
        return entries;
    }

    @Override
    public String toString() {
        return "\nMapStructure{" +
               entries +
                '}';
    }
}
