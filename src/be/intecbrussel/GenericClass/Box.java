package be.intecbrussel.GenericClass;

public class Box<T> {                            //generic class

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

}
