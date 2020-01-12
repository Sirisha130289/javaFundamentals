package be.intecbrussel.lambdas;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter filter) {
        for (String w : sentence.split(" ")) {
            if (filter.isValid(w)) {
                System.out.println(w);
            }
        }

    }

    public static void main(String[] args) {
        String input = "Life is beautiful";
        TextPrinter textPrinter = new TextPrinter(input);
//        textPrinter.printFilteredWords(new WordFilter() {
//            @Override
//            public boolean isValid(String s) {
//                if (s.contains("e")) {
//                    return true;
//                }
//                return false;
//            }
//        });
//
        textPrinter.printFilteredWords((String s) -> s.contains("e"));
    }
}
