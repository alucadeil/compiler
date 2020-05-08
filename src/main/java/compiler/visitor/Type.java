package compiler.visitor;


public enum Type {
    SET("Set"),
    ELEMENT("Element"),
    INTEGER("Integer"),
    STRING("String"),
    VOID("void");

    private String type;

    Type(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    static Type getTypeByString(String type){
        switch (type){
            case "Set":
                return SET;
            case "Element":
                return ELEMENT;
            case "Integer":
                return INTEGER;
            case "String":
                return STRING;
            default:
                return VOID;
        }
    }
}