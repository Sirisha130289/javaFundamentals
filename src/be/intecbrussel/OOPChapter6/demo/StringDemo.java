package be.intecbrussel.OOPChapter6.demo;

public class StringDemo {

    public static void main(String[] args) {
        String text = "hello";
        String otherText = new String("hello");

        // this text has the same message as otherText
        String sameText = new String("hello");
        // String sameText = text ;

        System.out.println(text);
        System.out.println(sameText);

        System.out.println(text == sameText);
        //System.out.println();
        System.out.println(text.equals(sameText));
    }
}

