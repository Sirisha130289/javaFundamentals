package be.intecbrussel.inheritancePracticeExercises.boats;

public class BoatApp {
    public static void main(String[] args) {
        Person captain1 = new Person();
        Person captain2 = new Person();
        Person captain3 = new Person();

        captain1.setName("Martin");
        captain1.setAge(25);

        captain2.setName("Justin");
        captain2.setAge(24);

        captain3.setName("Thumb");
        captain3.setAge(72);

        SailBoat boat1 = new SailBoat();
        SpeedBoat boat2 = new SpeedBoat();
        FisherBoat boat3 = new FisherBoat();


        boat1.setName("King of Namur");
        boat1.setTopSpeed(122);
        boat1.setWeight(2000);
        boat1.setCaptain(captain1);
        boat1.setSailSize(14);


        boat2.setName("Fast Boy");
        boat2.setTopSpeed(12);
        boat2.setWeight(550);
        boat2.setCaptain(captain2);
        boat2.setHorsePower(255);


        boat3.setName("Z54");
        boat3.setTopSpeed(40);
        boat3.setWeight(8000);
        boat3.setCaptain(captain3);

        System.out.println(boat1.getName());
        System.out.println(boat1.getWeight());
        System.out.println(boat1.getSailSize());
        System.out.println(boat1.getCaptain());
        boat1.accelerate();
        System.out.println();
        System.out.println(boat2.getName());
        System.out.println(boat2.getWeight());
        System.out.println(boat2.getHorsePower());
        System.out.println(boat2.getCaptain());
        boat2.accelerate();
        System.out.println();
        System.out.println(boat3.getName());
        System.out.println(boat3.getWeight());
        System.out.println(boat3.getNetSize());
        System.out.println(boat3.getCaptain());
        boat3.accelerate();

    }
}
