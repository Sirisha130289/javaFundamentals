package be.intecbrussel.bikeWorld_Sirisha;

public class ChildBike extends Bike {
    private final int WHEELS = 4;


    ChildBike(int frontGear,int backGear, double weight){
        super.setFrontGear(frontGear);
        super.setBackGear(backGear);
        super.setWeight(weight);
    }
    @Override
    public int getWHEELS() {
        return WHEELS;
    }

    @Override
    public int getDistance(int pedalAmount) {
        return pedalAmount;
    }

    @Override
    public String toString() {
        return " | cBike: " +
                super.getFrontGear() +" "+ super.getBackGear() + " "+ super.getWeight()
                ;
    }
}
