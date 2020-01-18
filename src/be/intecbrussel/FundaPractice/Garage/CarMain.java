package be.intecbrussel.FundaPractice.Garage;

public class CarMain {
    public static void main(String[] args) {
        GarageTesterClass garageTesterClass = new GarageTesterClass();


        System.out.println(garageTesterClass.car);

        garageTesterClass.car1.setGarage(garageTesterClass.garage1);
        System.out.println(garageTesterClass.car1);
        System.out.println(garageTesterClass.car2);

    }


}
