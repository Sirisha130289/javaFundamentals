package be.intecbrussel.FundaPractice.Lotter1;

import java.util.Scanner;

/**
 * This class is used to store the user inputed numbers in an array.
 * We use the Scanner utility class
 */
public class UserNumbers {

    private Scanner keybaord;

    public int[] userNumbers() {
        keybaord = new Scanner(System.in);

        int[] userInputedNumbers = new int[5];
        for (int i = 0; i < userInputedNumbers.length; i++) {
            System.out.println("Please enter the number");
            userInputedNumbers[i] = keybaord.nextInt();

        }
        return userInputedNumbers;
    }
}
