package be.intecbrussel.collections.demo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<StringBuilder> setOfStrings = new HashSet<>();
//        System.out.println(setOfStrings.add("Appel"));
//        System.out.println(setOfStrings.add("Aardbei"));
//        System.out.println(setOfStrings.add("Ananas"));
//        System.out.println(setOfStrings.add("passiervrucht"));
//        System.out.println(setOfStrings.add("passiervrucht"));


        setOfStrings.add(new StringBuilder("Sandrine"));
        setOfStrings.add(new StringBuilder("Sandrine"));

        setOfStrings.forEach(System.out::println);

    }
}
