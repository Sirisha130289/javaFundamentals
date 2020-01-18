package be.intecbrussel.FundaPractice.BikeRack;

public class MainBike {
    public static void main(String[] args) {

        MountainBike mountainBike1 = new MountainBike(3, 6, 2.5);
        MountainBike mountainBike2 = new MountainBike();
        mountainBike2.setFrontGear(3);
        mountainBike2.setBackGear(3);
        mountainBike2.setWeight(2.0);

        RaceBike raceBike1 = new RaceBike(3, 6, 1);
        RaceBike raceBike2 = new RaceBike(3, 8, 1.8);

        ChildBike childBike1 = new ChildBike(1, 1, 1);
        ChildBike childBike2 = new ChildBike(2, 1, 1.2);

        BikeRack bikeRack = new BikeRack();
        bikeRack.setName("SchoolPortLinks");
        bikeRack.addBikes(mountainBike1);
        bikeRack.addBikes(mountainBike2);
        bikeRack.addBikes(raceBike1);
        bikeRack.addBikes(raceBike2);
        bikeRack.addBikes(childBike1);
        bikeRack.addBikes(childBike2);

        bikeRack.printBikeRack();

        System.out.println("The acceleration coefficient is " + mountainBike1.getAccelerateCoeff());
        System.out.println("The acceleration coefficient is " + childBike1.getAccelerateCoeff());
        System.out.println("The acceleration coefficient is " + raceBike1.getAccelerateCoeff());

    }
}
