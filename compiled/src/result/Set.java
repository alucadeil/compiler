package result;

import java.util.HashSet;
import java.util.Collection;

public class Set extends Element {
    private java.util.Set set;
    private String name;

    public Set() {
        setDefaults();
    }

    public Set(Set set) {
        this();
        this.set = new HashSet<Element>(set.getElements());
        this.name = set.toString() + "-copy";
    }

    public Set(String name) {
        this();
        this.name = name;
    }

    private void setDefaults() {
        set = new HashSet<Element>();
    }

    public Set add(Element element) {
        this.set.add(element);

        return this;
    }

    public Set remove(Element element) {
        this.set.remove(element);

        return this;
    }

    public boolean contains(Element element) {
        return this.set.contains(element);
    }

    public String toString() {
        return this.name;
    }

    public java.util.Set<Element> getElements() {
        return this.set;
    }

    public int size() {
        return this.set.size();
    }

    public Set insersion(Set set) {
        Set resultSet = new Set(this);
        resultSet.getElements().retainAll(set.getElements());

        return resultSet;
    }

    public Set union(Set set) {
        Set resultSet = new Set(this);
        resultSet.getElements().addAll(set.getElements());

        return resultSet;
    }

    public Set complements(Set set) {
        Set resultSet = new Set(this);
        resultSet.getElements().removeAll(set.getElements());

        return resultSet;
    }

    public Set cartesianProduct(Set set) {
        Set resultSet = new Set("(" + this.toString() + ")*(" + set.toString() + ")");
        for (Element el1: this.getElements()) {
            for (Element el2: set.getElements()) {
                Set cortesianSet = new Set("{" + el1.toString() + ", " + el2.toString() + "}");
                cortesianSet.add(el1).add(el2);
                resultSet.add(cortesianSet);
            }
        }

        return resultSet;
    }

    public String pretty() {
        String pretty = "";
        for (Element el: this.getElements()) {
            pretty += "{" + el.pretty() + "}";
        }

        return pretty;
    }
}