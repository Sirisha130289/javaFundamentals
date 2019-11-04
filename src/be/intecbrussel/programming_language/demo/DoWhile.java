package be.intecbrussel.programming_language.demo;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Take flour");
        System.out.println("Add milk");
        System.out.println("Add eggs");
        System.out.println("Mix");
        int input;

        do {
            System.out.println("Bake");
            System.out.println("Enter 1 for Hungry and 2 for Satisfied");
            input = keyboard.nextInt();

            while (input != 1 && input != 2) {
                System.out.println("Enter 1 or 2");
                input = keyboard.nextInt();
            }
        } while (input == 1);
        System.out.println("End");
    }
}


