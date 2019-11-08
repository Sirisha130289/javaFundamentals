package be.intecbrussel.InheritanceChapter10.demo.InheritanceExample;

public class Helicopter extends Vehicle {
    private boolean hasBlades;
    private int bladeCount;

    @Override
    public void accelerateForward() {
        accelerateForward();
        System.out.println("Helicopter starts moving forward");
    }
    @Override
    public void accelerateBackward(){
        System.out.println("Helicopter starts moving backward");
    }
    public void accelerateSideways() {  //Positive==right

    }

    public void accelerateUp() {

    }

    public void fallDown() {
    }
}
