package be.intecbrussel.AssociatiesChapter9.exercises;

import java.util.Random;

public class HigherLowerGame {

    private int value;
    private int max;
    private Random rand;

    public void setValue() {
        this.value = value;
    }

    HigherLowerGame(int max) {
        this.max = max;
        rand = new Random();
        reset();
    }

    private void reset() {
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
}


