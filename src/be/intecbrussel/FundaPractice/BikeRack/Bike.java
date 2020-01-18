package be.intecbrussel.FundaPractice.BikeRack;

public class Bike {
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

    //methods
    public static double getDistance(int pedalAmount) {
        return 0;
    }
    public double getAccelerateCoeff(){
        return (getFrontGear()*getBackGear())/(getWeight());
    }

    @Override
    public String toString() {
        return "Bike{" +
                "WHEELS=" + WHEELS +
                ", frontGear=" + frontGear +
                ", backGear=" + backGear +
                ", weight=" + weight +
                '}';
    }
}
