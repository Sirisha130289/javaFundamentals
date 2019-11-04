package be.intecbrussel.AssociatiesChapter9.demo;

import java.util.Random;
import java.util.Scanner;

public class HighLowApp {
    private int max;
    private int value;
    private Random rand = new Random();

    HighLowApp(int max) {
        this.max = max;
        setGuess();
    }

    public void setGuess() {
        value = rand.nextInt(max + 1);
    }

    public int guess(int guessValue) {
        if (guessValue < value) {
            return -1;
        } else if (guessValue > value) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        HighLowApp hla = new HighLowApp(10);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = keyboard.nextInt();

        while (hla.guess(num) != 0) {
            if (hla.guess(num) == -1) {
                System.out.println("You guessed Lower");
            } else if (hla.guess(num) == 1) {
                System.out.println("You guessed higher");
            }
            System.out.println("Enter the number");
            num = keyboard.nextInt();
        }
        System.out.println("You guessed it");

    }
}
