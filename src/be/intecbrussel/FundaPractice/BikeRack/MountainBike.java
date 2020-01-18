package be.intecbrussel.FundaPractice.BikeRack;

public class MountainBike extends Bike {
    private int diskBrakes;

    public int getDiskBrakes() {
        return diskBrakes;
    }

    public void setDiskBrakes(int diskBrakes) {
        this.diskBrakes = diskBrakes;
    }

    public MountainBike() {
    }

    public MountainBike(int frontGear, int backGear, double weight) {
        super.setFrontGear(frontGear);
        super.setBackGear(backGear);
        super.setWeight(weight);
    }


    @Override
    public String toString() {
        return "MountainBike{" +"FrontGear : "+
                getFrontGear() +", BackGear: "+ getBackGear()+", Weight: " + getWeight() +
                '}';
    }
}
