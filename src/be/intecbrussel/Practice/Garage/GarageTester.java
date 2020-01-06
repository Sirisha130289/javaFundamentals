package be.intecbrussel.Practice.Garage;

public class GarageTester {

    public static void main(String[] args) {

        Garage garage1 = new Garage("East");
        Garage garage2 = new Garage("West");
        Garage garage3 = new Garage("North");


        Auto auto1 = new Auto("Audi", garage1);
        Auto auto2 = new Auto("BMW");
        Auto auto3 = new Auto("Honda");

        auto2.setGarage(garage2);
        auto3.setGarage(garage3);

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
    }

}
