package be.intecbrussel.AssociatiesChapter9.exercises;

import java.util.Scanner;

public class HighLowerApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number");
        int guessvalue = keyboard.nextInt();
        HigherLowerGame hlg = new HigherLowerGame(10);

        while (hlg.guess(guessvalue) != 0) {
            if (hlg.guess(guessvalue) == -1) {
                System.out.println("It is higher");

            } else if (hlg.guess(guessvalue) == 1) {
                System.out.println("It is lower");
            }

            System.out.println("Enter a new number");
            guessvalue = keyboard.nextInt();
        }
        System.out.println("You have guessed");
    }
}
