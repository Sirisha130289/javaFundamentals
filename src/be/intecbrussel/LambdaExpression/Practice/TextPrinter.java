package be.intecbrussel.LambdaExpression.Practice;

public class TextPrinter {
    private String sentence;
    private int value;
    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public TextPrinter(int value) {
        this.value = value;
    }

    public void printFilteredWords(WordInterface wordInterface) {
        for (String s : sentence.split(" ")) {
            if (wordInterface.isValid(s)) {
                System.out.println(s);
            }
        }
    }

    public void printProcessedWords(WordProcessor wordProcessor) {
        for (String s : sentence.split(" ")) {
            System.out.println(wordProcessor.process(s));
        }
    }

    public void printNumbers(NumberProcessor numberProcessor) {
        System.out.println(numberProcessor.getMultipliedNumber(value)) ;
    }

    public void printNumberValues(NumberParser numberParser){
        for (String w : sentence.split(" ")) {
            System.out.format("%,.2f%n",numberParser.parse(w));
        }
    }
}


