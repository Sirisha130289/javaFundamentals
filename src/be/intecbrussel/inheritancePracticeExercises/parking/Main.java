package be.intecbrussel.inheritancePracticeExercises.parking;

import java.util.Arrays;

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

        autoSchool.listParkedCars();

        Cars audi = new Audi();
        Cars porsche = new Porsche();
        Cars peugot = new Peugot();
        System.out.println(tesla);


    }
}
