package be.intecbrussel.FundaPractice.Lottery;

import java.util.Scanner;

public class UserInput {
    private Scanner keyboard;

    public int[] userInputNumbers() {
        keyboard = new Scanner(System.in);
        int[] userNumbers = new int[5];
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Please enter a number 1-10");
            userNumbers[i] = keyboard.nextInt();
        }

        return userNumbers;
    }
}
