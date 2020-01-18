package be.intecbrussel.FundaPractice.BikeRack;

import java.util.Arrays;

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

    //printing the bikes
    public void printBikeRack() {
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i]);
        }

    }

    //adding bikes to the Bike Rack.
    public Bike[] addBikes(Bike bike) {

        for (int i = 0; i < bikes.length; i++) {

            if (bikes[i] == null) {
                bikes[i] = bike;
                break;
            }
            //removing the 3rd bike and adding the last bike in case if there are more than 5 bikes.
            if (bikes[4] != null) {
                bikes[2] = bike;
            }
        }
        return bikes;
    }

    @Override
    public String toString() {
        return "BikeRack{" +
                "name='" + name + '\'' +
                ", bikes=" + Arrays.toString(bikes) +
                '}';
    }
}
