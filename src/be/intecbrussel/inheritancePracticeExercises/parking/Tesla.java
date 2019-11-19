package be.intecbrussel.inheritancePracticeExercises.parking;

public  class Tesla extends Cars {

    @Override
    public String toString() {
        return "|" + getCarName() + "0 " + getCarWeight() +
                '|';
    }

    @Override
    public void fuelUp() {
        System.out.println("This Tesla car runs on petrol");

    }

}