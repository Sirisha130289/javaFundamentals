package be.intecbrussel.StreamAPI.exercises;

import java.util.stream.Stream;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private float weight;
    private float height;

    public Person(String firstName, String lastName, Gender gender, int age, float weight, float height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

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

    public Gender getGender() {
        return getGender();
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {

        Person[] people = new Person[3];
        people[0] = new Person("Sirisha", "Ayyagari",Gender.FEMALE , 30, 50, 1.53f);
        people[1] = new Person("Kalyan", "Chavali", Gender.MALE,30, 82, 1.80f);
        people[2] = new Person("Satwika", "Chavali",Gender.FEMALE,  4, 17, 1.06f);

        Stream.of(people).forEach(System.out::println);


    }

}
