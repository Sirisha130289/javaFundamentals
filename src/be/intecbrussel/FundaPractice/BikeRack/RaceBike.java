package be.intecbrussel.FundaPractice.BikeRack;

public class RaceBike extends Bike {
    private double speedMultiplier;

    public double getSpeedMultiplier() {
        return speedMultiplier;
    }

    public void setSpeedMultiplier(double speedMultiplier) {
        this.speedMultiplier = speedMultiplier;
    }

    public RaceBike(int frontGear, int backGear, double weight) {
        super.setFrontGear(frontGear);
        super.setBackGear(backGear);
        super.setWeight(weight);
    }

    @Override
    public String toString() {
        return "RaceBike{" +"FrontGear : "+
                getFrontGear() +", BackGear: "+ getBackGear()+", Weight: " + getWeight() +
                '}';
    }
}
