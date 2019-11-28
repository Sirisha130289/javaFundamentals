package be.intecbrussel.bikeWorld_Sirisha;

public class MountainBike extends Bike {
    private int discBrakes;


    MountainBike() {

    }

    MountainBike(int frontGear, int backGear, double weight) {
        super.setFrontGear(frontGear);
        super.setBackGear(backGear);
        super.setWeight(weight);
    }


    @Override
    public int getDistance(int pedalAmount) {
        return pedalAmount;
    }

    public int getDiscBrakes() {
        return discBrakes;
    }

    public void setDiscBrakes(int discBrakes) {
        this.discBrakes = discBrakes;
    }


    @Override
    public String toString() {
        return " | mBike: " +
                super.getFrontGear() +" "+ super.getBackGear() + " "+ super.getWeight()
                ;
    }

}
