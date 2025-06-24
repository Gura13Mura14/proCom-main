package analyzer;
import AST.ComponentDeclaration;
import AST.Selector;
import symbol.SelectorSymbol;
import symbol.SemanticSymbol;

import java.util.HashMap;
import java.util.Map;

public class SelectorSemantic {



        // جدول رمزي لحفظ الـ selectors
       /* private static final Map<String, Location> selectorTable = new HashMap<>();

        /**
         * تحليل مكون واحد والتأكد من أن selector غير مكرر.
         *
         * @param component كائن الـ ComponentDeclaration
         * @param line رقم السطر في ملف الإدخال
         * @param column رقم العمود في ملف الإدخال
         */
       /* public void analyze(ComponentDeclaration component, int line, int column) {
            Selector selector = component.getSelector();
            if (selector == null) {
                return; // لا يوجد selector، لا حاجة للتحقق
            }

            String selectorName = selector.getSelector();

            // تحقق من التكرار
            if (selectorTable.containsKey(selectorName)) {
                Location existing = selectorTable.get(selectorName);
                throw new SemanticException(
                        String.format(
                                "Semantic Error: Duplicate selector '%s'\n" +
                                        " - First declared at line %d, column %d\n" +
                                        " - Duplicate found at line %d, column %d",
                                selectorName, existing.line, existing.column, line, column
                        )
                );
            }

            // أضف إلى الجدول الرمزي
            selectorTable.put(selectorName, new Location(line, column));
        }

        // كلاس داخلي لحفظ موقع السطر والعمود
        private static class Location {
            int line;
            int column;

            Location(int line, int column) {
                this.line = line;
                this.column = column;
            }
        }}*/











        private static final SelectorSymbol selectorSymbolTable = new SelectorSymbol();

        public void analyze(ComponentDeclaration component, int line, int column) {
            Selector selector = component.getSelector();
            if (selector == null) return;

            String selectorName = selector.getSelector();

            // تحقق من وجود سابق
            SemanticSymbol existing = selectorSymbolTable.getFirst(selectorName);
            if (existing != null) {
                // الرمز الجديد مع خطأ
                SemanticSymbol duplicateSymbol = new SemanticSymbol(
                        selectorName, "Selector", selectorName,
                        line, column, "DuplicateSelector"
                );
                selectorSymbolTable.add(duplicateSymbol);

                // اطبع الجدول
                if (selectorSymbolTable.getAll().size() >= 2) {
                    System.out.println("\n📋 Selector Symbol Table (on error):");
                    selectorSymbolTable.printAll();
                }

                throw new SemanticException(
                        String.format(
                                "Semantic Error: Duplicate selector '%s'\n" +
                                        " - First declared at line %d, column %d\n" +
                                        " - Duplicate found at line %d, column %d",
                                selectorName,
                                existing.getLine(), existing.getColumn(),
                                line, column
                        )
                );
            }

            // أول مرة: أضفه بشكل طبيعي
            SemanticSymbol validSymbol = new SemanticSymbol(
                    selectorName, "Selector", selectorName,
                    line, column, null
            );
            selectorSymbolTable.add(validSymbol);
        }

        public SelectorSymbol getSelectorSymbolTable() {
            return selectorSymbolTable;
        }
    }
