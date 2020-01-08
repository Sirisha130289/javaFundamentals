package be.intecbrussel.Test06012020.Final;

public class GeneralQuizApp {
    public static void main(String[] args) {

        QuizService quizService = new QuizService();

        System.out.println("Welcome to the quiz\n");
        System.out.println("There are 10 addition/subtraction questions," + "the answers to evry question is an integer\n");

        quizService.createQuiz();
        quizService.administrateQuiz();
        quizService.gradeQuiz();
    }
}
