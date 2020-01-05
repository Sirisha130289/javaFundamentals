package be.intecbrussel.exceptionsChapter12.exercises;

import java.util.Scanner;

public class ex4Division {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = 0;
        int den = 0;
        try {
            num = Integer.parseInt(keyboard.next());
            den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.format(" %d/%d=%d ", num, den, div);
            keyboard.close();
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("Invalid input");
        }
        System.out.println("The End");
    }
}
