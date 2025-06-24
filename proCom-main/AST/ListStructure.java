package AST;

import java.util.ArrayList;
import java.util.List;

public class ListStructure implements ASTNode {
    private List<ItemsStructures> items;

    public ListStructure() {
        this.items = new ArrayList<>();
    }

    public void addItem(ItemsStructures item) {
        this.items.add(item);
    }

    public List<ItemsStructures> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "\nListStructure{" +
                 items +
                '}';
    }
}
