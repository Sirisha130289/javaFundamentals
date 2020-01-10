package be.intecbrussel.bounded_wildcards;

public class Coordinates<T extends TwoD> {
     T[] coords;

    public Coordinates(T[] coords) {
        this.coords = coords;
    }


}

