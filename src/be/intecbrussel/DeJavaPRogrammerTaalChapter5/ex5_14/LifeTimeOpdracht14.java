package be.intecbrussel.DeJavaPRogrammerTaalChapter5.ex5_14;

import java.util.Scanner;

public class LifeTimeOpdracht14 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = keyboard.nextInt();
        if (age >= 18) {
            System.out.println("Adult");
        } else if (age < 18 && age >= 10) {
            System.out.println("Teenager");
        } else if (age < 10 && age >= 2) {
            System.out.println("Child");
        } else if (age < 2) {
            System.out.println("Baby");
        }
    }
}