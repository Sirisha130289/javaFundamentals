package be.intecbrussel.StreamAPI.Demo;

import be.intecbrussel.StreamAPI.exercises.Gender;

import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
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
        return gender;
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
        people[0] = new Person("Sirisha", "Ayyagari", Gender.FEMALE, 30, 50, 1.53f);
        people[1] = new Person("Kalyan", "Chavali", Gender.MALE, 31, 82, 1.80f);
        people[2] = new Person("Satwika", "Chavali", Gender.FEMALE, 4, 17, 1.06f);

//       Person[] filteredArray= Stream.of(people).filter(p->p.getLastName().contains("Chavali")).toArray(Person[]::new);
//       Stream.of(filteredArray).forEach(System.out::println);

        Stream.of(people).filter(p -> p.getGender() == Gender.FEMALE).forEach(System.out::println);

        Person maxAgedPerson = Stream.of(people).max(Comparator.comparing(Person::getAge)).get();
        System.out.println("Max aged person : " + maxAgedPerson);
        System.out.println("Persons between weights");
        Stream.of(people).filter(p -> p.getWeight() > 20).filter(p -> p.getWeight() < 80).forEach(System.out::println);
        System.out.println("Print ages");
        Stream.of(people).sorted((p1, p2) -> p1.getAge() - p2.getAge()).mapToInt(Person::getAge).forEach(System.out::println); // int comparision minus , string use compareTo

        System.out.println("First and last names");
        Stream.of(people).map(p -> p.getFirstName() + " " + p.getLastName()).forEach(System.out::println);

//        int minAgedPerson = Stream.of(people).min((p1, p2) -> p1.getAge() - p2.getAge()).map(Person::getAge).get();
        Person minAgedPerson = Stream.of(people).min((p1, p2) -> p1.getAge() - p2.getAge()).get();
        System.out.println("Min Age using compartor: " + minAgedPerson.getAge());

        System.out.println("print avg");

        OptionalInt min = Stream.of(people).mapToInt(Person::getAge).min();
        if (min.isPresent()) {
            System.out.println(min.getAsInt());
        }

        OptionalInt max = Stream.of(people).mapToInt(Person::getAge).max();
        if (max.isPresent()) {
            System.out.println(max.getAsInt());
        }
        OptionalDouble avg = Stream.of(people).mapToInt(Person::getAge).average();
        if (avg.isPresent()) {
            System.out.println(avg.getAsDouble());
        }
        OptionalDouble avg1 = Stream.of(people).mapToDouble(Person::getWeight).average();
        if (avg1.isPresent()) {
            System.out.println(avg1.getAsDouble());
        }
        Stream.of(people).mapToDouble(Person::getWeight).forEach(System.out::println);

        OptionalDouble min1 = Stream.of(people).mapToDouble(Person::getWeight).min();
        if (min1.isPresent()) {
            System.out.println(min1.getAsDouble());
        }

        OptionalDouble max1 = Stream.of(people).mapToDouble(Person::getWeight).max();
        if (max1.isPresent()) {
            System.out.println(max1.getAsDouble());
        }


    }

}
