package be.intecbrussel.extraExercises4.garage;

public class GarageTester {
    public static void main(String[] args) {

        Garage garage1 = new Garage();
        Garage garage2 = new Garage();
        Garage garage3 = new Garage();

        garage1.setName("Verstraeten NV");
        garage2.setName("South");
        garage3.setName("North");

        Auto auto1 = new Auto("BMW Z4 ", garage1);
        Auto auto2 = new Auto("Tesla", garage2);
        Auto auto3 = new Auto("Audi", garage3);



        System.out.println(auto1);// the varaible name automatically calls the toString.
        System.out.println(auto2);                                // System.out.println(auto.toString());
        System.out.println(auto3);
    }
}
