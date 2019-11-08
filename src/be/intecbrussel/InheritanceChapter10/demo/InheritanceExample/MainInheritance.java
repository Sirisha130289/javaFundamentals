package be.intecbrussel.InheritanceChapter10.demo.InheritanceExample;

public class MainInheritance {
    public static void main(String[] args) {
        ApacheAttackHelicopter heli = new ApacheAttackHelicopter();
        heli.accelerateForward();
        heli.accelerateBackward();

        Vehicle vehicle = new Vehicle() {
            @Override
            public void accelerateForward() {

            }
        };
        vehicle.accelerateForward();

//        Car car = new Car();
//        car.accelerateForward();
    }
}
