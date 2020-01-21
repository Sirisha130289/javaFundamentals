package be.intecbrussel.collections.exercises.exercise3;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Set<Integer> integerSet = new java.util.LinkedHashSet<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter a number between  1- 45");
            int numberEntered = keyboard.nextInt();
            integerSet.add(numberEntered);
        }
        integerSet.forEach(System.out::println);


        Random rand = new Random();
        Set<Integer> randSet = new java.util.LinkedHashSet<>();
        System.out.println("Random numbers 1-45");
        for (int i = 0; i < integerSet.size(); i++) {

            int randomNumber = rand.nextInt(45);
            randSet.add(randomNumber);
        }
        randSet.forEach(System.out::println);

        //before retainsAll()

        integerSet.retainAll(randSet);
        //after retainsAll()
        System.out.println("After retainAll()" + integerSet);

    }
}


