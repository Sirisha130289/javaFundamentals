package be.intecbrussel.Test_Java_classes_Sirisha;

public class Rocket {
    private int speed;
    private Tank fuelTank = new Tank();
    private RocketEngine engine = new RocketEngine();
    private Person pilot;
    private double payload;



    public void liftOff() {

    }


    public Tank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelIn) {
        this.fuelTank.setFuelCapacity(fuelIn);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double calculateDistance() {

        return (fuelTank.getFuelCapacity())/(speed * payload);
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public Person getPilot() {
        return pilot;
    }

    public void setPilot(Person pilot) {
        this.pilot = pilot;
    }
}
