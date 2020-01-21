package be.intecbrussel.collections.exercises.exercise4;

import java.util.NavigableSet;
import java.util.Scanner;

public class TreeSet {
    public static void main(String[] args) {

        NavigableSet<String> navigableSet = new java.util.TreeSet<>();
        Scanner keyboard = new Scanner(System.in);
        String word = null;
        do {
            System.out.println("Please enter a word");
            word = keyboard.next();
            if (word.endsWith(".")) {
                break;
            } else {
                System.out.println("Adding word: " + word);
            }
        } while (true);

        navigableSet.forEach(System.out::print);
      navigableSet.stream().forEach(s -> System.out.println());
    }
}

