package be.intecbrussel.LambdaExpression.Exercises.ex_1_18;

public class TextPrinterMain {
    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter("Life is beautiful enjoy to the fullest");
        System.out.println("Words with letter 'e' ");
        textPrinter.printSentence(s -> s.contains("e"));
        System.out.println("Words with length more than 4");
        textPrinter.printSentence(s -> s.length() > 4);


    }

}
