package be.intecbrussel.LambdaExpression.Exercises.ex_1_18;

import java.util.function.Predicate;

public class TextPrinter {
    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printSentence(WordFilter wordFilter) {
        for (String s : sentence.split(" ")) {
            if (wordFilter.isValid(s)) {
                System.out.println(s);
            }
        }
    }

    public void printPredicateSentence(Predicate<String> predicate) {
        for (String s : sentence.split(" ")) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}

