package be.intecbrussel.Practice.GOKK;

import java.util.Random;

public class Guess {

    private Random rand = new Random();
    private int guessNumber;

    Guess(){
        guessNumber = new Random().nextInt(10);
    }
    public Guess(int guessNumber) {
        this.guessNumber = guessNumber;
        guessNumber = rand.nextInt(10);

    }

    public int getGuessNumber() {
        return guessNumber;
    }

    @Override
    public String toString() {
        return "Guess{" +
                "rand=" + rand +
                ", guessNumber=" + guessNumber +
                '}';
    }
}
