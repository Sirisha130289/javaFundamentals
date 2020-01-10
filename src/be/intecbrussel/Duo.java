package be.intecbrussel;

public class Duo <E> {

    private E first;                       // as Object is the super class of java
    private E second;

    public Duo(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public void swap() {
        E temp = first;
        first = second;
        second = temp;
    }
}
