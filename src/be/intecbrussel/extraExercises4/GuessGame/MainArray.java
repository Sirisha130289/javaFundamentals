package be.intecbrussel.extraExercises4.GuessGame;

import java.util.Arrays;
import java.util.Scanner;

public class MainArray {

    public static void main(String[] args) {
        Guess[] guess = new Guess[5];

        guess[0] = new Guess();
        guess[1] = new Guess();
        guess[2] = new Guess();
        guess[3] = new Guess();
        guess[4] = new Guess();

        System.out.println(Arrays.toString(guess));
        int[] guessedNumber = new int[5];


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number between 1-10");
        guessedNumber[0] = keyboard.nextInt();
        int count = 1;

        for (int i = 0; i < guessedNumber.length; i++) {
            guess[i]= new Guess();
            System.out.println(guess[i]);


                while (guessedNumber[i] <= 0 || guessedNumber[i] > 10) {
                    System.out.println("Please enter a number between 1-10");
                    guessedNumber[i] = keyboard.nextInt();


                }


                boolean guessed = false;
                while (guessedNumber[i] != guess[0].getNumber() && !guessed) {
                    System.out.println("Please try again");
                    guessedNumber[i] = keyboard.nextInt();
                    count++;
                    if (count == 5) {
                        System.out.println("Your chances are over");
                        guessed = true;
                    }

                }


                if (guessedNumber[i] == guess[0].getNumber()) {
                    System.out.println("You have guessed it right");
                    System.out.println("Number of chances took: " + count);
                }

                System.out.println(Arrays.toString(guessedNumber));
            }





    }
    }




