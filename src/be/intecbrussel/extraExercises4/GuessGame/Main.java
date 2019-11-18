package be.intecbrussel.extraExercises4.GuessGame;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Guess guess = new Guess();


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number between 1-10");
        int guessedNumber = keyboard.nextInt();
        int count = 1;

        while (guessedNumber <= 0 || guessedNumber > 10) {
            System.out.println("Please enter a number between 1-10");
            guessedNumber = keyboard.nextInt();


        }


        boolean guessed = false;
        while (guessedNumber != guess.getNumber() && !guessed) {
            System.out.println("Please try again");
            guessedNumber = keyboard.nextInt();
            count++;
            if (count >= 5) {
                System.out.println("Your chances are over");
                guessed = true;
            }

        }
        if (guessedNumber == guess.getNumber()) {
            System.out.println("You have guessed it right");
            System.out.println("Number of chances took: " + count);
        }


    }
}




