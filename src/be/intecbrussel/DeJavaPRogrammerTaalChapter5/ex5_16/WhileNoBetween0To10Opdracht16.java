package be.intecbrussel.DeJavaPRogrammerTaalChapter5.ex5_16;

import java.util.Scanner;

public class WhileNoBetween0To10Opdracht16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 10");
        int number = keyboard.nextInt();

        while (number < 0 || number > 10) {
            System.out.println("Please enter a valid number");
            number = keyboard.nextInt();
        }

    }
}
