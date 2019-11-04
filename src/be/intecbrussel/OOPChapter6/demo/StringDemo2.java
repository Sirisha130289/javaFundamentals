package be.intecbrussel.OOPChapter6.demo;

public class StringDemo2 {
    public static void main(String[] args) {

        String text = "saxophone";
        text = text.concat(" is what I play");

        System.out.println(text);

        StringBuilder stringBuilder= new StringBuilder("saxophone");
        stringBuilder.append(" is what I play");
        System.out.println(stringBuilder);
    }
}
