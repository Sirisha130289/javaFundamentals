package be.intecbrussel.bikeWorld_Sirisha;

public class MainBikeApp {
    public static void main(String[] args) {
        BikeRack bikeRack = new BikeRack();
        bikeRack.setName("SchoolPortLinks");

        Bike[] bikes = new Bike[6];
        bikes[0] = new MountainBike();
        bikes[1] = new MountainBike(3, 6, 2500);
        bikes[2] = new RaceBike(3, 6, 1000);
        bikes[3] = new RaceBike(3, 8, 1800);
        bikes[4] = new ChildBike(1, 1, 1000);
        bikes[5] = new ChildBike(2, 1, 2000);

        bikes[0].setFrontGear(3);
        bikes[0].setBackGear(6);
        bikes[0].setWeight(2500);

        bikeRack.addBikeToRack(bikes[0]);
        bikeRack.addBikeToRack(bikes[1]);
        bikeRack.addBikeToRack(bikes[2]);
        bikeRack.addBikeToRack(bikes[3]);
        bikeRack.addBikeToRack(bikes[4]);
        bikeRack.addBikeToRack(bikes[5]);

        bikeRack.printBikeRack();

        double distance1 = ((bikes[0].getFrontGear() * bikes[0].getBackGear()) / bikes[0].getWeight()) * bikes[0].getDistance(3000);
        System.out.format("The distance travelled is : %.2f", distance1);
        System.out.println(" kms");
        // System.out.println("The distance travelled is : " + ;
        System.out.format("The distance travelled is : %.2f",  ((bikes[2].getFrontGear() * bikes[2].getBackGear()) / bikes[2].getWeight()) * bikes[2].getDistance(3000) , "kms");
        System.out.println(" kms");
        System.out.format("The distance travelled is : %.2f " , ((bikes[4].getFrontGear() * bikes[4].getBackGear()) / bikes[4].getWeight()) * bikes[4].getDistance(3000) , "kms");
        System.out.println(" kms");
    }

}