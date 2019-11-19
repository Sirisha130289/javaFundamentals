package be.intecbrussel.inheritancePracticeExercises.parking;

import java.util.Arrays;

import static be.intecbrussel.inheritancePracticeExercises.parking.ParkingPlace.parkedCars;

public class Main {
    public static void main(String[] args) {
        ParkingPlace autoSchool = new ParkingPlace();


        Cars tesla = new Tesla();
        tesla.setCarName("Tesla");
        tesla.setCarWeight(3000);
        autoSchool.parkCar(tesla);

        Cars bmw = new BMW();
        bmw.setCarName("BMW");
        bmw.setCarWeight(1500);

        autoSchool.parkCar(bmw);


        Cars audi = new Audi();
        audi.setCarName("Audi");
        audi.setCarWeight(3000);
        autoSchool.parkCar(audi);


        Cars porsche = new Porsche();
        porsche.setCarWeight(4000);
        porsche.setCarName("Porsche");
        autoSchool.parkCar(porsche);


        Cars peugot = new Peugot();
        peugot.setCarName("Peugot");
        peugot.setCarWeight(1500);
        autoSchool.parkCar(peugot);

        autoSchool.listParkedCars();
        System.out.println();
        System.out.println("No of cars parked " + parkedCars);
    }
}
