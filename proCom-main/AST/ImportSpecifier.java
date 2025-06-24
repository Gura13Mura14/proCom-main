package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportSpecifier implements ASTNode {
    // Represents a single named import with an optional alias
    public static class Specifier {
        private String name;  // The imported name (e.g., `A`)
        private String alias; // The alias (e.g., `AliasA`), or null if no alias is used

        public Specifier(String name, String alias) {
            this.name = name;
            this.alias = alias;
        }

        public String getName() {
            return name;
        }

        public String getAlias() {
            return alias;
        }

        @Override
        public String toString() {
            return alias == null ? name : name + " as " + alias;
        }
    }

    private List<Specifier> specifiers; // A list of all specifiers within `{}`

    public ImportSpecifier() {
        this.specifiers = new ArrayList<>();
    }

    public void addSpecifier(String name, String alias) {
        this.specifiers.add(new Specifier(name, alias));
    }

    public List<Specifier> getSpecifiers() {
        return specifiers;
    }

    @Override
    public String toString() {
        return "\nImportSpecifier{" +
                specifiers +
                "}";
    }
}
