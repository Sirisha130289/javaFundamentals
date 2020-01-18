package be.intecbrussel.FundaPractice.CarEnum;

public class CarApp {
    Person[] people = new Person[10];
    Car[] cars = new Car[10];

    public void addPersons(Person person) {
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                people[i] = person;
            }
        }
        System.out.println(person);
    }

    public void addCars(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = car;
            }

        }
        System.out.println(car);
    }



}
