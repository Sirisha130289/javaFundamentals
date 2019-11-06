package be.intecbrussel.InheritanceChapter10.demo;

public class Bicycle {

    //this is the base class
    //the bicycle has 2 fields
    public int gear;
    public int speed;

    //the Bicycle class has one constructor

    Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    //the Bicycle class has 3 methods

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
// toString() method to print info of Bicycle
    public String toString(){
        return ("No of gears are " + gear
                +"\n"
                +"Speed of Bicycle is "+speed);
    }
}
