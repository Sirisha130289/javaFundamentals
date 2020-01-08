package be.intecbrussel.Test06012020.Practice;

import java.util.Random;

/**
 *
 */
public class AdditionQuestion implements QuizQuestion {

   private Random rand = new Random();

    private int firstNumber;
    private int secondNumber;

    AdditionQuestion() {                            //as the variables are being instantiated in the constructor, we should never send them as arguments
        firstNumber = rand.nextInt(10);    //instantiating the variables by applying random utility class.
        secondNumber = rand.nextInt(10);
    }

    @Override
    public String toString() {
        return "AdditionQuestion{" +
                "rand=" + rand +
                ", firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }

    @Override
    public String getQuestion() {
        return "What is the sum of the numbers? " + firstNumber + " + " + secondNumber;
    }

    @Override
    public int getCorrectAnswer() {
        return firstNumber + secondNumber;
    }
}

