package be.intecbrussel.inheritancePracticeExercises.boats;

public class Passenger extends  Person{
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    private String destination;
}
