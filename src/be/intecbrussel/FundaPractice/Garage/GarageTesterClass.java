package be.intecbrussel.FundaPractice.Garage;

public class GarageTesterClass {
    Garage garage = new Garage("Garage1");
    Garage garage1 = new Garage("Garage2");

    Car car = new Car("Tesla",garage);
    Car car1 = new Car("Audi");

    Car car2 = new Car(car1);

}
