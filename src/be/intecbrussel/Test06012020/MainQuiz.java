package be.intecbrussel.Test06012020;

public class MainQuiz {
    public static void main(String[] args) {
        QuizService quizService = new QuizService();
        quizService.createQuiz();
        quizService.administrateQuiz();
        quizService.gradeQuiz();
    }
}
