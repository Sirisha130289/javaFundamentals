package be.intecbrussel.collections.exercises.exercise2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private double weight;
    private double height;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public Person(String firstName, String lastName, String gender, int age, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Double.compare(person.getWeight(), getWeight()) == 0 &&
                Double.compare(person.getHeight(), getHeight()) == 0 &&
                Objects.equals(getFirstName(), person.getFirstName()) &&
                Objects.equals(getLastName(), person.getLastName()) &&
                Objects.equals(getGender(), person.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getGender(), getAge(), getWeight(), getHeight());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {

        Person person = new Person("Sirisha", "Ayyagari", "Female", 30, 51, 1.53);
        Person person1 = new Person("Sirisha", "Ayyagari", "Female", 30, 51, 1.53);
        Person person2 = new Person("Kalyan", "Chavali", "Male", 30, 82, 1.81);
        Person person3 = new Person("Satwika", "Chavali", "Female", 4, 17, 1.06);
        Set<Person> personSet = new HashSet<>();
        personSet.add(person);
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.forEach(System.out::println);
    }
}
