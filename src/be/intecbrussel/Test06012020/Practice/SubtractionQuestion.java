package be.intecbrussel.Test06012020.Practice;

import java.util.Random;

public class SubtractionQuestion implements QuizQuestion {

    private Random rand = new Random();

    private int firstNumber;
    private int secondNumber;

    SubtractionQuestion() {
        firstNumber = rand.nextInt(10);
        secondNumber = rand.nextInt(10);
        if (firstNumber < secondNumber) {
            int temp = secondNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
        }
    }

    @Override
    public String toString() {
        return "SubtractionQuestion{" +
                "rand=" + rand +
                ", firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }

    @Override
    public String getQuestion() {
        return "What is the difference between the numbers ? " + firstNumber + " - " + secondNumber;
    }

    @Override
    public int getCorrectAnswer() {
        return firstNumber - secondNumber;
    }
}
