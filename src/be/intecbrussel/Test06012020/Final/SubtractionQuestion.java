package be.intecbrussel.Test06012020.Final;


import java.util.Random;

public class SubtractionQuestion implements QuizQuestion {

    Random random = new Random();

    private int firstNumber;
    private int secondNumber;

    SubtractionQuestion() {
        this.firstNumber = random.nextInt(10);
        this.secondNumber = random.nextInt(10);
        if(secondNumber>firstNumber){
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber=temp;
        }
    }

    @Override
    public String getQuestion() {
        return "What is the difference of two numbers? " + firstNumber + " - " + secondNumber;
    }

    @Override
    public int getCorrectAnswer() {
        return firstNumber-secondNumber;
    }
}

