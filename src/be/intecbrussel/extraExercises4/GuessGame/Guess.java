package be.intecbrussel.extraExercises4.GuessGame;
import java.util.Random;

public class Guess {
    private static Random rand = new Random();
    private int number;

   public Guess(){
        number = rand.nextInt(10);
    }

    public int getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return "{" +
                 number +
                '}';
    }
}
