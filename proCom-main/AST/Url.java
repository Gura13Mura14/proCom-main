package AST;

public class Url implements ASTNode {
    private final String value;
    private final boolean isStyleUrl;
    private final String prefix; // "STYLEURL" أو "TEMPLATEURL"

    public Url(String prefix, String value, boolean isStyleUrl) {
        this.prefix = prefix;
        this.value = value;
        this.isStyleUrl = isStyleUrl;
    }

    public Url(String replace) {
        this.value = replace;
        this.isStyleUrl = false;       // أو true حسب الحاجة
        this.prefix = "";              // أو "TEMPLATEURL"/"STYLEURL" حسب السياق
    }

    public Url(String replace, String value, boolean isStyleUrl, String prefix) {

        this.value = value;
        this.isStyleUrl = isStyleUrl;
        this.prefix = prefix;
    }



    // Getter methods
    public String getValue() {
        return value;
    }

    public boolean isStyleUrl() {
        return isStyleUrl;
    }

    public String getPrefix() {
        return prefix;
    }

    @Override
    public String toString() {
        return "Url{" +
                "prefix='" + prefix + '\'' +
                ", value='" + value + '\'' +
                ", isStyleUrl=" + isStyleUrl +
                '}';
    }
}