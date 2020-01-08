package be.intecbrussel.Test06012020.Practice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class QuizService {

    Random rand = new Random();

    private QuizQuestion[] questions;
    private int[] userAnswers;
    private Scanner keyboard;


    public void createQuiz() {
        questions = new QuizQuestion[10];
        for (int i = 0; i < questions.length; i++) {
            questions[i] = generateRandomQuestion();
        }

        }

    private QuizQuestion generateRandomQuestion() {
        QuizQuestion question = null;
        int randomNumber = rand.nextInt(2);
        if (randomNumber == 0) {
            question = new AdditionQuestion();
        } else {
            question = new SubtractionQuestion();
        }
        return question;
    }

    public int getInput() {
        keyboard = new Scanner(System.in);
        int answer = 0;
        while (true) {
            try {
                System.out.println("Please give your answer");
                answer = keyboard.nextInt();
                return answer;
            } catch (InputMismatchException ex) {
                System.out.println("Please provide an integer");
                keyboard.next();
            }
        }
    }

    public void administrateQuiz() {
        userAnswers=new int[10];
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question no " + (i+1) + ": "+questions[i].getQuestion());
            userAnswers[i] = getInput();
        }
    }

    public void gradeQuiz() {
        int count = 0;
        for (int i = 0; i < questions.length; i++) {
            int correctAnswer = questions[i].getCorrectAnswer();
            int yourAnswer = userAnswers[i];
            if (correctAnswer == yourAnswer) {
                count++;

            }
            System.out.println("Question no " + (i+1) + ": "+questions[i].getQuestion());
            System.out.println("Correct answer is : " + correctAnswer);
            System.out.println("Your answer is : " + yourAnswer);
            int totalScore = count * 10;
            System.out.println("Your total Score is: " + totalScore);
        }
    }

}

