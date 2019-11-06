package be.intecbrussel.InheritanceChapter10.demo;

public class Polymorphism {


    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles();
        Car car = new Car();
        Bus bus = new Bus();
        Plane plane = new Plane();

        Vehicles car1 = new Car();
        car.printModel();
        car1.printModel();
        car.makeSound();

    }
}

class Vehicles {
    void printModel() {
        System.out.println("Basic Vehicle");
    }
}

class Car extends Vehicles {

    void printModels() {
        System.out.println("Model2020");
    }

    void makeSound() {
        System.out.println("sound");
    }
}


class Bus extends Vehicles {
    @Override
    void printModel() {
        System.out.println("Model Bus");
    }
}

class Plane extends Vehicles {
    @Override
    void printModel() {
        System.out.println("Model Plane");
    }
}