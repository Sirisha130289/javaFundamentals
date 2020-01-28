package be.intecbrussel.collections.exercises.exercise7;

public class PersonDetails implements Comparable<PersonDetails>{

    private String name;
    private int age;
    private double weight;
    private double height;

    public PersonDetails(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int compareTo(PersonDetails personDetails) {
        int result =0;
        result+= this.name.compareToIgnoreCase(personDetails.name);
        result+= this.getAge()-personDetails.getAge();
        return result;
    }

    @Override
    public String toString() {
        return "PersonDetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
