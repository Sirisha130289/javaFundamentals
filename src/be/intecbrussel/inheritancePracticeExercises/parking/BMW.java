package be.intecbrussel.inheritancePracticeExercises.parking;

public class BMW extends Cars {
    @Override
    public String toString() {
        return "|" + getCarName() + "0 " + getCarWeight() +
                '|';
    }


    @Override
    public void fuelUp() {
        System.out.println("This BMW car runs on gasoline");
    }
}