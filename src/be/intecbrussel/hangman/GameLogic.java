package be.intecbrussel.hangman;

import be.intecbrussel.inheritancePracticeExercises.Array;

import java.util.Arrays;
import java.util.Scanner;

public class GameLogic {
    Scanner keyboard = new Scanner(System.in);
    ConsoleReader consoleReader = new ConsoleReader();
    DataReader dataReader = new DataReader();
    StaticDataProvider staticDataProvider = new StaticDataProvider();
    UserDetails userDetails = new UserDetails();

    int chances = 10;

    char[] chars;
    char[] display;

    public GameLogic() {
        chars = staticDataProvider.randomWord().toLowerCase().toCharArray();
        display = new char[chars.length];
        for (int i = 0; i < display.length; i++) {
            display[i] = '_';
        }
    }

    public void startGame() {
        System.out.println("Welcome to the Hangman Game ,"+ userDetails.userName+ "Below are the rules of the game");
        dataReader.rules();
        consoleReader.playerName();

    }

    public void playGame() {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.println("Please make your guess");

            for (char c : display) {
                System.out.print(c + " ");
            }
            String userChoice = userInput.nextLine().toLowerCase();
            chances--;
            for (int i = 0; i < chars.length; i++) {
                if (Character.compare(chars[i], userChoice.charAt(0)) == 0) {
                    display[i] = chars[i];
                }
            }


            if (Arrays.equals(display, chars)) {
                System.out.println("You won");
                for (char c : display) {
                    System.out.print(c + " ");
                }
                break;
            } else if ((chances == 0)) {
                System.out.println("You are left with no chances, Game Over");
                break;
            } else {
                System.out.println("You have " + chances + " chances left");
            }

        }
    }


    public void showScore() {

    }

}

