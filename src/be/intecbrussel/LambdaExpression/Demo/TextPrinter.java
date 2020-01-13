package be.intecbrussel.LambdaExpression.Demo;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printFilterWords(WordFilter wordFilter) {
        for (String s : sentence.split(" ")) {
            if (wordFilter.isValid(s)) {
                System.out.println(s);
            }
        }
    }

    public void printProcessedWords(WordProcessor wordProcessor){
        for (String s: sentence.split(" ")) {
            System.out.println(wordProcessor.process(s));
        }

    }

    public void printNumbers(NumberParser numberParser){
        for (String s: sentence.split(" ")) {
            System.out.println(String.format(".2%f%n",numberParser.parse(s)));
        }
    }
}
