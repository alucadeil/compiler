package result;
public class Element {
    private Object object;

    public Element() {

    }

    public Element(Object object) {
        this.object = object;
    }

    public String toString() {
        return this.object.toString();
    }

    public String pretty() {
        return this.toString();
    }
}