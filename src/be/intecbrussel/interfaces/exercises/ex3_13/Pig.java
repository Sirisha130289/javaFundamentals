package be.intecbrussel.interfaces.exercises.ex3_13;

public interface Pig {
    public void grunt();

    default void fly() {
        System.out.println("Pig cant fly");
    }
}
