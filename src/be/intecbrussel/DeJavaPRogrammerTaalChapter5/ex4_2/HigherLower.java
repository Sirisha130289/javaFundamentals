package be.intecbrussel.DeJavaPRogrammerTaalChapter5.ex4_2;

import java.util.Scanner;
import java.util.Random;

public class HigherLower {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt (100);
        System.out.println("Enter a number");
        boolean guessed = false;
        int attempts = 1;

        while (!guessed) {
            // how many attempts

            attempts++;
            int guess = keyboard.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Higher");
            }
            else if (guess > numberToGuess) {
                System.out.println("Lower");
            }
            else {
                System.out.println("You got it, It took you "+ attempts+ " attempt");
                guessed = true;
            }
        }
    }
}
