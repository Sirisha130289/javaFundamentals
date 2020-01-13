 package be.intecbrussel.LambdaExpression.Practice;

 import java.math.BigDecimal;

 public class TextPrinterApp {
    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter("This is the sentence for testing purposes");
        textPrinter.printFilteredWords(s -> s.contains("e"));
        textPrinter.printProcessedWords(s -> String.format("<<%s>>", s));
        TextPrinter textPrinter1 = new TextPrinter(10);
        textPrinter1.printNumbers(number -> number * 100);

        textPrinter.printProcessedWords(s -> TextUtil.quotes(s));  //if it is static method, u will call the class name.
        textPrinter.printProcessedWords(TextUtil::quotes);              // there will be no parameters in method references


        TextPadder textPadder = new TextPadder(10);
        textPrinter.printProcessedWords(s -> textPadder.pad(s));        // if it is instance method, we need to call the object.
        textPrinter.printProcessedWords(textPadder::pad);

        TextPrinter textPrinter2 = new TextPrinter("145 256 351 489632" );
            textPrinter2.printNumberValues(s -> new BigDecimal(s));
        }
    }

