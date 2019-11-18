package be.intecbrussel.extraExercises4.garage;

public class Garage {
    private String name;

    public void Garage(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                '}';
    }
}
