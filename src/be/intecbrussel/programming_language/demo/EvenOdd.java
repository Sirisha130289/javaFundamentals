package be.intecbrussel.programming_language.demo;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number between 0 - 100");
        int number = keyboard.nextInt();
        while (number < 0 || number > 100) {
            System.out.println("Please enter a number between 0 - 100");
            number = keyboard.nextInt();
        }

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }


    }
}

