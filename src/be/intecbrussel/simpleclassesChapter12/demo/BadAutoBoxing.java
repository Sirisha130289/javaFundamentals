package be.intecbrussel.simpleclassesChapter12.demo;


import java.io.PrintStream;
import java.util.Formatter;

public class BadAutoBoxing {
    public static void main(String[] args) {
        Integer a=5;
        Integer b=6;
        Integer c =a+b;
        System.out.println(c);

        String text="I'm %d years old and I'm %f m tall ! ";
        Formatter formatter=new Formatter();
        System.out.println(formatter.format(text,21,1.75)) ;
        System.out.println(formatter.format(text,Integer.valueOf(21),Double.valueOf(1.75))) ;

    }
}