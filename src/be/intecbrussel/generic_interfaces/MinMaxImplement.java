package be.intecbrussel.generic_interfaces;

public class MinMaxImplement<T extends Comparable<T>> implements MinMax<T> {

    T[] values;

    public MinMaxImplement(T[] array) {
        this.values = array;
    }

    @Override
    public T min() {
        T value = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i].compareTo(value) < 0) {
                value = values[i];
            }
        }
        return value;
    }

    @Override
    public T max() {
        T value = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i].compareTo(value) > 0) {
                value = values[i];
            }

        }
        return value;
    }
}
