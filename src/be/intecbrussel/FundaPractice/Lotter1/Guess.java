package be.intecbrussel.FundaPractice.Lotter1;

import java.util.Random;

/**
 * This class ic created to randomly generate the numbers by the system.
 * We use the Random utility class for this. We store the randomly generated numbers in an array.
 */
public class Guess {

    private Random rand;

    public int[] randomNumbers() {
        rand = new Random();
        int[] randomGeneratedNumbers = new int[5];
        for (int i = 0; i < randomGeneratedNumbers.length; i++) {
            randomGeneratedNumbers[i] = rand.nextInt(5);
        }
        return randomGeneratedNumbers;
    }

}
