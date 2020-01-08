package be.intecbrussel.Test06012020.Final;

import java.util.Random;

public class AdditionalQuestion implements QuizQuestion {

    Random random = new Random();

    private int firstNumber;
    private int secondNumber;

    AdditionalQuestion() {
        this.firstNumber = random.nextInt(10);
        this.secondNumber = random.nextInt(10);
    }


    @Override
    public String getQuestion() {
        return "What is the sum of two numbers? " + firstNumber + " + " + secondNumber;
    }

    @Override
    public int getCorrectAnswer() {
        return firstNumber + secondNumber;
    }
}
