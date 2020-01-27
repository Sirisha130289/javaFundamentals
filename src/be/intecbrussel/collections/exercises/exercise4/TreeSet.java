package be.intecbrussel.collections.exercises.exercise4;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TreeSet {
    public static void main(String[] args) {

        NavigableSet<String> navigableSet = new java.util.TreeSet<>();
        Scanner keyboard = new Scanner(System.in);
        String word = null;
        do {
            System.out.println("Please enter a word");
            word = keyboard.next();

            if (word.endsWith(".")) {
                navigableSet.add(word);
                break;
            } else {
                System.out.println("Adding word: " + word);
                navigableSet.add(word);
            }
        } while (true);


        System.out.println(navigableSet);
        System.out.println(navigableSet.first());
        System.out.println(navigableSet.last());

    }
}

