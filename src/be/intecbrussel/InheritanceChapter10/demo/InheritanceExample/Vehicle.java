package be.intecbrussel.InheritanceChapter10.demo.InheritanceExample;

public abstract class Vehicle {
    public Engine engine;
    private int capacityPeople;
    private long capacityGoods;
    private int wheelCount;
    private double speed;

    public abstract void accelerateForward();



    public void accelerateBackward() {
        System.out.println("moorv moorV");
    }
}
