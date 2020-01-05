package be.intecbrussel.exceptionsChapter12.exercises;

import java.util.Scanner;

public class ex1Division {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = 0;
        int den = 0;
        while ((num >= 'a' || num <= 'z') && (den >= 'a' || den <= 'z')) {
            try {
                num = Integer.parseInt(keyboard.next());
                den = Integer.parseInt(keyboard.next());
                int div = num / den;
                System.out.format(" %d/%d=%d ", num, den, div);

            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
                System.out.println("Please enter a number as input");
                keyboard.next();

            }

        }

        keyboard.close();
        System.out.println("The End");
    }
}

