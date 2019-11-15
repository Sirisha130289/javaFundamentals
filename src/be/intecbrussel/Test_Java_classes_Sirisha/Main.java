package be.intecbrussel.Test_Java_classes_Sirisha;

public class Main {
    public static void main(String[] args) {
        Rocket[] rocket = new Rocket[3];
        rocket[0] = new Rocket();
        rocket[1] = new Rocket();
        rocket[2] = new Rocket();

        rocket[0].setSpeed(50);
        rocket[0].setPayload(200);
        // rocket[0].calculateDistance();


        rocket[1].setSpeed(60);
        rocket[1].setPayload(250);

        rocket[2].setSpeed(50);
        rocket[2].setPayload(20);


        rocket[0].setFuelTank(150000000);
        rocket[1].setFuelTank(25000000);
        rocket[2].setFuelTank(40000000);

//        Person[] person = new Person[2];
//        person[0] = new Person("han",65);
        //   person[1].setName("Douglas");
        //    person[1].setAge(42);

        Person pilot1 = new Person();
        pilot1.setName("Douglas");
        pilot1.setAge(42);
        Person pilot2 = new Person("Han", 65);


        //setting persons in rockets
        rocket[0].setPilot(pilot1);

        rocket[1].setPilot(pilot2);




        System.out.println("Rocket 1 can travel : " + Math.round(rocket[0].calculateDistance()) + "  kms"+ " with " + rocket[0].getPilot());
        System.out.println("Rocket 2 can travel : " + Math.round(rocket[1].calculateDistance()) + "  kms" + " with " + rocket[1].getPilot());
        System.out.println("Rocket 3 can travel : " + Math.round(rocket[2].calculateDistance()) + "  kms"+" with no pilot");
    }
}
