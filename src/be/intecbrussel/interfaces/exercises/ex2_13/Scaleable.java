package be.intecbrussel.interfaces.exercises.ex2_13;

public interface Scaleable {

    int QUARTER = 25;
    int HALF = 50;
    int DOUBLE = 200;

    void scale(int s);

    public default void scaleDouble() {
        scale(DOUBLE);
    }

    public default void scaleHalf() {
        scale(HALF);
    }


}
