package symbol ;

public class SemanticSymbol {
    String name;      // اسم الخاصية (مثلاً: templateUrl)
    private String type;      // نوع الخاصية (مثلاً: Url)
    private String value;     // القيمة (إن وجدت)
    private int line;
    private int column;
    private String errorType; // نوع الخطأ (مثلاً: MissingProperty)

    public SemanticSymbol(String name, String type, String value, int line, int column, String errorType) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.line = line;
        this.column = column;
        this.errorType = errorType;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public String getErrorType() {
        return errorType;
    }

    @Override
    public String toString() {
        return "SemanticSymbol{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", line=" + line +
                ", column=" + column +
                ", errorType='" + errorType + '\'' +
                '}';
    }
}
