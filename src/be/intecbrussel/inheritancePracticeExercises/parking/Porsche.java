package be.intecbrussel.inheritancePracticeExercises.parking;

public class Porsche extends Cars {

    @Override
    public void fuelUp() {
        System.out.println("This Porsche car runs on petrol");
    }

    public String toString() {
        return "|" + getCarName() + "0 " + getCarWeight() +
                '|';
    }
}



