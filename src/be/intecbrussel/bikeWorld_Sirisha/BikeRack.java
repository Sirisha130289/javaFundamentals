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
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i]);
        }
    }


    public void addBikeToRack(Bike bike) {
        for (int i = 0; i < bikes.length; i++) {
            if (bikes[4] != null) {
                bikes[2] = bike;

            }
            if (bikes[i] == null) {
                bikes[i] = bike;
                break;
            }


        }

    }
}



