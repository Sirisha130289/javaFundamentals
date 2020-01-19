package be.intecbrussel.FundaPractice.CarEnum;

public class Main {
    public static void main(String[] args) {

        CarApp carApp = new CarApp();

        Person person1 = new Person("John", 54);
        Person person2 = new Person("Mickey", 45);
        Person person3 = new Person("Bob", 27);
        Person person4 = new Person("Tom", 56);
        Person person5 = new Person("Jerry", 23);
        Person person6 = new Person("Minie", 47);
        Person person7 = new Person("Emilie", 16);
        Person person8 = new Person("Peppa", 34);
        Person person9 = new Person("George", 29);
        Person person10 = new Person("Gazale", 56);

        Car car1 = new Car(233, BrandName.AUDI, person1, FuelType.DIESEL, 125000, 3000);
        Car car2 = new Car(250, BrandName.BMW, person2, FuelType.ELECTRIC, 100000, 3500);
        Car car3 = new Car(350, BrandName.PORSCHE, person1, FuelType.GAS, 1150000, 3200);
        Car car4 = new Car(460, BrandName.PEUGOT, person2, FuelType.PETROL, 30000, 2800);
        Car car5 = new Car(220, BrandName.TESLA, person3, FuelType.DIESEL, 250000, 3000);

        carApp.addCars(car1);
        carApp.addCars(car2);
        carApp.addCars(car3);
        carApp.addCars(car4);
        carApp.addCars(car5);


    }
}
