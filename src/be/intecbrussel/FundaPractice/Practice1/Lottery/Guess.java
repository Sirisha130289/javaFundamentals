package be.intecbrussel.FundaPractice.Practice1.Lottery;

import java.util.Random;

public class Guess {
    private Random rand;

    public int[] systemGeneratedNumbers() {
        rand = new Random();
        int[] numbersGenerated = new int[5];
        for (int i = 0; i < numbersGenerated.length; i++) {
            numbersGenerated[i] = rand.nextInt(10);
        }
        return numbersGenerated;
    }


}
