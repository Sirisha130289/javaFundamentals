package be.intecbrussel.collections.exercises.exercise7;

import java.util.*;

public class Person{
    public static void main(String[] args) {

        List<PersonDetails> personDetailsList = new ArrayList<>();
        SortedSet<PersonDetails> personDetailsSet = new TreeSet<>();


        //ading elements using list
        personDetailsSet.add(new PersonDetails("Hari",46,54.6,1.64));
        personDetailsSet.add(new PersonDetails("Teja",20,40,1.74));
        personDetailsSet.add(new PersonDetails("Surya",18,38,1.79));
        personDetailsSet.add(new PersonDetails("Chandu",28,55.6,1.49));
        personDetailsSet.add(new PersonDetails("Nani",32,68.6,1.64));






        //adding elements using set
        personDetailsSet.add(new PersonDetails("Hari",46,54.6,1.64));
        personDetailsSet.add(new PersonDetails("Teja",20,40,1.74));
        personDetailsSet.add(new PersonDetails("Surya",18,38,1.79));
        personDetailsSet.add(new PersonDetails("Chandu",28,55.6,1.49));
        personDetailsSet.add(new PersonDetails("Nani",32,68.6,1.64));

        System.out.println("Before Sorting");
        personDetailsSet.forEach(System.out::println);
        System.out.println();
        System.out.println("After Sorting with age");
        personDetailsSet.stream().sorted(Comparator.comparing(PersonDetails::getAge)).forEach(System.out::println);


    }


}
