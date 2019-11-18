package be.intecbrussel.inheritancePracticeExercises.parking;

public abstract class Cars {
    private String carName;
    private int carWeight;

    Cars() {

    }

    Cars(String name, int weight) {
        this.carName = name;
        this.carWeight = weight;
    }

    Cars(String name) {
        this.carName = name;
    }

    Cars(Cars c) {
        this.carName = c.carName;
        this.carWeight = c.carWeight;
    }

    @Override
    public String toString() {
        return "|" + carName + "0 " + carWeight +
                '|';
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public abstract void fuelUp();
}



