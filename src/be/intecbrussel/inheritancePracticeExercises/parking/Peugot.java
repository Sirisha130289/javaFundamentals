package be.intecbrussel.inheritancePracticeExercises.parking;

public class Peugot extends Cars {

    @Override
    public void fuelUp() {
        System.out.println("This Peugot car runs on diesel");
    }

    public String toString() {
        return "|" + getCarName() + "0 " + getCarWeight() +
                '|';
    }
}



