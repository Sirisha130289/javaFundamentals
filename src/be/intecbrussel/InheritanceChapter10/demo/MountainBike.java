package be.intecbrussel.InheritanceChapter10.demo;

public class MountainBike extends Bicycle {
    //the MountainBike subclass adds one more field
    public int seatHeight;

    //the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed, int seatHeight) {
        //invoking base class constructor
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    // the MountainBike subclass adds one more method
    public void setSeatHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    // @Override

    public String toString() {
        return (super.toString() +
                "\n seat height is " + seatHeight);
    }
}
