package be.intecbrussel.bikeWorld_Sirisha;

public abstract class Bike {
    private final int WHEELS = 2;
    private int frontGear;
    private int backGear;
    private double weight;

    public int getWHEELS() {
        return WHEELS;
    }

    public int getFrontGear() {
        return frontGear;
    }

    public void setFrontGear(int frontGear) {
        this.frontGear = frontGear;
    }

    public int getBackGear() {
        return backGear;
    }

    public void setBackGear(int backGear) {
        this.backGear = backGear;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract int getDistance(int pedalAmount);

    private double getAccelerateCoefficient() {
        return getAccelerateCoefficient();
    }


}