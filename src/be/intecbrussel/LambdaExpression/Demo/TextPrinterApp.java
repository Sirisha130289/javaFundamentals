package be.intecbrussel.LambdaExpression.Demo;

import java.math.BigDecimal;

public class TextPrinterApp {
    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter(" This is a sentence for testing purposes");


        textPrinter.printFilterWords((s) -> s.contains("e"));
        textPrinter.printFilterWords((s) -> s.length() > 4);
        textPrinter.printFilterWords((s) -> s.toLowerCase().startsWith("t"));
        textPrinter.printProcessedWords(s -> TextUtil.quote(s));
        textPrinter.printProcessedWords(TextUtil::quote);

        TextPadder textPadder = new TextPadder(20);
        textPrinter.printProcessedWords(textPadder::pad);
        textPrinter.printProcessedWords(s -> textPadder.pad(s));

        textPrinter.printProcessedWords(String::toUpperCase);

        TextPrinter textPrinter1 = new TextPrinter("6548 258 63 998 39 ");
        textPrinter1.printNumbers(BigDecimal::new);

//        //Words containing "e"
//        System.out.println("Words containing letter e");
//        textPrinter.printFilterWords(new WordFilter() {
//            @Override
//            public boolean isValid(String s) {
//                return s.contains("e");
//            }
//        });

//        //length of the words more thann 4
//        System.out.println("Words whose length is more than 4");
//        textPrinter.printFilterWords(new WordFilter() {
//            @Override
//            public boolean isValid(String s) {
//                return s.length()>4;
//            }
//        });

        //words starting with "t"
//        System.out.println("Words starting with letter t");
//        textPrinter.printFilterWords(new WordFilter() {
//            @Override
//            public boolean isValid(String s) {
//                s=s.toLowerCase();
//                return s.startsWith("t");
//            }
//        });


    }
}
