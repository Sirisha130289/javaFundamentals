package be.intecbrussel.Test06012020.Final;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class QuizService {

    private QuizQuestion[] questions;
    private int[] userAnswers;
    Scanner keyboard = new Scanner(System.in);

    void createQuiz() {
        questions = new QuizQuestion[10];
        for (int i = 0; i < questions.length; i++) {
            questions[i] = generateRandomQuestion();

        }
    }

    private QuizQuestion generateRandomQuestion() {
        Random rand = new Random();
        int question = rand.nextInt(2);
        if (question == 0) {
            return new AdditionalQuestion();
        } else {
            return new SubtractionQuestion();
        }
    }

    public int getInput() {

        while (true) {
        try {
            System.out.println("Please give in your answer: ");
            return keyboard.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter an integer!");
            keyboard.next();
        }
    }
}

    public void administrateQuiz() {
        userAnswers = new int[10];
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].getQuestion());
            userAnswers[i] = getInput();
        }


    }

    public void gradeQuiz() {
        int count = 0;
        for (int i = 0; i < questions.length; i++) {

            String question = questions[i].getQuestion();
            System.out.println(question);

            int correctAnswer = questions[i].getCorrectAnswer();
            int yourAnswer = userAnswers[i];
            System.out.println("Correct answer is : " + correctAnswer);
            System.out.println("Your answer is :" + yourAnswer);


            if (correctAnswer == yourAnswer) {
                count++;
                int totalScore = count * 10;
                System.out.println("Your totalscore is:" + totalScore);
            }


        }
    }

}
