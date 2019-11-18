package be.intecbrussel.inheritancePracticeExercises.parking;

public  class BMW extends Cars {
    @Override
    public String toString() {
        return "|" + getCarName() + "0 " + getCarWeight() +
                '|';
    }
BMW(){
        super("BMW",1200);
}

    @Override
    public void fuelUp() {
        System.out.println("This car runs on gasoline");
    }
}