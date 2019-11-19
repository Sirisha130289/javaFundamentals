package be.intecbrussel.inheritancePracticeExercises.parking;

import be.intecbrussel.inheritancePracticeExercises.Array;

import java.io.Console;
import java.util.Arrays;

/**
 *
 */
public class ParkingPlace {


    Cars[] cars = new Cars[5];
    static int parkedCars = 0;

    public void parkCar(Cars car) {
        cars[parkedCars] = car;
        parkedCars++;

    }

    public void listParkedCars() {
        int count = 0;
        for (Cars car : cars) {
            System.out.print(car);
            count++;
            if ((count % 3) == 0) {
                System.out.println();
            }
        }


    }

}





