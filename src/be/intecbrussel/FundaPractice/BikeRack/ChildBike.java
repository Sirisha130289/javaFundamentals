package be.intecbrussel.FundaPractice.BikeRack;

public class ChildBike extends Bike{
    private final int WHEELS =4;

    @Override
    public int getWHEELS() {
        return WHEELS;
    }
    public ChildBike(int frontGear, int backGear, double weight) {
        super.setFrontGear(frontGear);
        super.setBackGear(backGear);
        super.setWeight(weight);
    }
    @Override
    public String toString() {
        return "ChildBike{"
                +"FrontGear : "+
                getFrontGear() +", BackGear: "+ getBackGear()+", Weight: " + getWeight() +
                '}';
    }
}
