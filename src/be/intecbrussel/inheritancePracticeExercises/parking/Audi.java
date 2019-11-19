package be.intecbrussel.inheritancePracticeExercises.parking;

public class Audi extends Cars {

    @Override
    public void fuelUp() {
        System.out.println("This Audi car runs on Diesel");
    }

    public String toString() {
        return "|" + getCarName() + "0 " + getCarWeight() +
                '|';
    }
}



