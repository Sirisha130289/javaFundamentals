package be.intecbrussel.inheritancePracticeExercises.parking;

public  class Tesla extends Cars {







    @Override
    public String toString() {
        return "Tesla{" +
                "carName='" + getCarName() + '\'' +
                ", carWeight=" + getCarWeight() +
                '}';
    }

    @Override
    public void fuelUp() {
        System.out.println("This Tesla car runs on petrol");

    }

}