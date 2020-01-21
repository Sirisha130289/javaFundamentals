package be.intecbrussel.collections.exercises.exercise2;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Set<Integer> integerSet = new java.util.HashSet<>();
//        for (int i = 0; i < 5; i++) {
//
//            System.out.println("Please enter number between 1-45");
//            int num = scan.nextInt();
//
//            integerSet.add(num);
//        }
//
//
//        integerSet.forEach(System.out::println);
//        System.out.println("Sum: " + integerSet.stream().mapToDouble(value -> value).sum());
//        System.out.println("Average: " + integerSet.stream().mapToDouble(value -> value).average().getAsDouble());
//        System.out.println("Minimum: " + integerSet.stream().mapToDouble(value -> value).min().getAsDouble());
//        System.out.println("Maximum: " + integerSet.stream().mapToDouble(value -> value).max().getAsDouble());
//
        Set<Integer> userInputted = new java.util.HashSet<>();


        System.out.println("Set 1: Please provide numbers between 1-45");
        for (int i = 0; i < 6; i++) {
            int userInput = scan.nextInt();
            userInputted.add(userInput);
            while
            (userInput < 1 || userInput >= 45) {
                System.out.println("Please enter correct number");
                userInput = scan.nextInt();
            }
        }


        //userInputted.forEach(System.out::println);

//        System.out.println("Sum: " + userInputted.stream().mapToDouble(value -> value).sum());
//        System.out.println("Average: " + userInputted.stream().mapToDouble(value -> value).average().getAsDouble());
//        System.out.println("Minimum: " + userInputted.stream().mapToDouble(value -> value).min().getAsDouble());
//        System.out.println("Maximum: " + userInputted.stream().mapToDouble(value -> value).max().getAsDouble());

        Set<Integer> randomNumbers = new java.util.HashSet<>();
        Random rand2 = new Random();

        System.out.println("Set 2 : Random numbers(2) 1-45");
        for (int i = 0; i < userInputted.size(); i++) {
            int randNumber = rand2.nextInt(45);
            randomNumbers.add(randNumber);
        }

        //  randomNumbers.forEach(System.out::println);
        System.out.println(userInputted);
        System.out.println(randomNumbers);
//        System.out.println("Sum: " + randomNumbers.stream().mapToDouble(value -> value).sum());
//        System.out.println("Average: " + randomNumbers.stream().mapToDouble(value -> value).average().getAsDouble());
//        System.out.println("Minimum: " + randomNumbers.stream().mapToDouble(value -> value).min().getAsDouble());
//        System.out.println("Maximum: " + randomNumbers.stream().mapToDouble(value -> value).max().getAsDouble());


        // using retainAll() method
        userInputted.retainAll(randomNumbers);

        // print userInputted
        System.out.println("Set after retainAll() operation : "
                + userInputted);


    }


}
