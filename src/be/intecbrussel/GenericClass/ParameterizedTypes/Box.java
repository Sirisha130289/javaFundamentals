package be.intecbrussel.GenericClass.ParameterizedTypes;

public class Box<T,S> {

    private T t;
    private S s;

    public void add(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getT() {
        return t;
    }

    public S getS() {
        return s;
    }
}
