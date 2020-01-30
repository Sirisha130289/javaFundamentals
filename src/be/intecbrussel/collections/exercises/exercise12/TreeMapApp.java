package be.intecbrussel.collections.exercises.exercise12;


import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapApp {
    public static void main(String[] args) {
        SortedMap<String, Person> persons = new TreeMap<>();

        Person person1 = new Person("Jos", 5);
        Person person2 = new Person("Jef", 70);

        persons.put(person1.getName(), person1);
        persons.put(person2.getName(), person2);

        System.out.println("Method reference");
        persons.entrySet().forEach(System.out::println);

        System.out.println("Lambda BiConsumer");
        persons.forEach((k, v) -> System.out.println(k + " " + v));


        System.out.println(persons.get("Jef"));
        System.out.println(persons.firstKey());
        System.out.println(persons.lastKey());


    }
}
