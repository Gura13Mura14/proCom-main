package symbol;

import java.util.ArrayList;
import java.util.List;

public class SelectorSymbol {

    private final List<SemanticSymbol> selectorTable = new ArrayList<>();

    // نضيف الرمز مباشرة
    public void add(SemanticSymbol symbol) {
        selectorTable.add(symbol);
    }

    // نحصل على أول رمز باسم محدد (للكشف عن التكرار)
    public SemanticSymbol getFirst(String selectorName) {
        for (SemanticSymbol symbol : selectorTable) {
            if (symbol.getName().equals(selectorName)) {
                return symbol;
            }
        }
        return null;
    }

    public List<SemanticSymbol> getAll() {
        return selectorTable;
    }

    public void printAll() {
        for (SemanticSymbol symbol : selectorTable) {
            System.out.println(symbol);
        }
    }
}
