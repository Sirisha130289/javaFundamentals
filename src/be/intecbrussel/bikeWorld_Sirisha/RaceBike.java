package be.intecbrussel.bikeWorld_Sirisha;

public class RaceBike extends Bike {

    private double speedMultiplier;

    RaceBike(int frontGear,int backGear, double weight){
        super.setFrontGear(frontGear);
        super.setBackGear(backGear);
        super.setWeight(weight);
    }

    @Override
    public int getDistance(int pedalAmount) {
        return pedalAmount;
    }

    public double getSpeedMultiplier() {
        return speedMultiplier;
    }

    public void setSpeedMultiplier(double speedMultiplier) {
        this.speedMultiplier = speedMultiplier;
    }

    @Override
    public String toString() {
        return " | rBike: " +
                super.getFrontGear() +" "+ super.getBackGear() + " "+ super.getWeight()
                ;
    }
}
