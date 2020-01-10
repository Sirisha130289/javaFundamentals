package be.intecbrussel.bounded_wildcards;


import static be.intecbrussel.bounded_wildcards.BoundedWildCard.*;

public class BoundedWildCardApp {
    public static void main(String[] args) {

        TwoD[] twoDS = {
                new TwoD(1, 6),
                new TwoD(9, 3),
                new TwoD(2, 8),

        };

        Coordinates<TwoD> coordinates = new Coordinates<>(twoDS);
        showXY(coordinates);
        ThreeD[] threeDS = {
                new ThreeD(1, 6, 3),
                new ThreeD(9, 3, 6),
                new ThreeD(2, 8, 7),

        };

        Coordinates<ThreeD> coordinates1 = new Coordinates<>(threeDS);
        showXYZ(coordinates1);
        showXY(coordinates);

        FourD[] fourDS = {
                new FourD(1, 6, 4, 5),
                new FourD(9, 3, 4, 9),
                new FourD(2, 8, 7, 6),

        };

        Coordinates<FourD> coordinates2 = new Coordinates<>(fourDS);
        showXYZT(coordinates2);
        showXYZ(coordinates1);
        showXY(coordinates);
    }


}
