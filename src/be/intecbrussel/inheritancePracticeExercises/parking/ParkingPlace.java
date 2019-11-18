package be.intecbrussel.inheritancePracticeExercises.parking;

/**
 *
 */
public class ParkingPlace {


    Cars[] cars = new Cars[10];
    int parkedCars = 0;

    public void parkCar(Cars car) {
        cars[parkedCars] = car;
        parkedCars++;
    }

    public void listParkedCars() {
        for (Cars car : cars) {
            System.out.println(car);
        }
    }
}