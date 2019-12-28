package be.intecbrussel.simpleclassesChapter12.exercises;

import java.util.Scanner;

public class ex1_12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.next();

        int number = Integer.parseInt(input);
        System.out.println(number);

        int bitCount=Integer.bitCount(number);
        System.out.println("The bit count is:"+bitCount);
        int byteCount =  (int) Math.ceil(bitCount/8d);  // used for rounding up.Math.ceil
        System.out.println("The byte count is:" + byteCount );

    }
}
