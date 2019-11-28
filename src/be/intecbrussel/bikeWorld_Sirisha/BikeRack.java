package be.intecbrussel.bikeWorld_Sirisha;

public class BikeRack {
    private String name;
    private Bike[] bikes = new Bike[5];


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bike[] getBikes() {
        return bikes;
    }

    public void setBikes(Bike[] bikes) {
        this.bikes = bikes;
    }


    public void printBikeRack() {

    }


    public void addBikeToRack(Bike bike) {
        for (int i = 0; i < bikes.length; i++) {
            if (bikes[i] == null) {
                bikes[i] = bike;

                if (bikes.length ==5) {

                    bikes[2] = bikes[5];


                }
                System.out.println(bikes[i]);
                break;
            }
        }

    }
}




