package be.intecbrussel.Practice.Garage;

public class Garage {
    private String name;

    Garage(String name){
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
