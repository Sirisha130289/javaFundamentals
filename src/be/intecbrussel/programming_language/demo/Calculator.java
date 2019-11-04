package be.intecbrussel.programming_language.demo;

import java.util.Scanner;

public class Calculator {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the 1st number");
        int number1 = keyboard.nextInt();
        System.out.println("Enter the 2nd number");
        int number2 = keyboard.nextInt();

        System.out.println("Choose a number from 1-4");

        System.out.println("1 = Addition");
        System.out.println("2 = Subtraction");
        System.out.println("3 = Multiplication");
        System.out.println("4 = Division");

        int number3 = keyboard.nextInt();
        while (number3 < 1 || number3 > 4)
            {
                System.out.println("Please choose a number between 1-4");
                number3 = keyboard.nextInt();
            }
            if (number3 == 1) {
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
            } else if (number3 == 2) {
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
            } else if (number3 == 3) {
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
            } else if (number3 == 4) {
                System.out.println(number1 + "/ " + number2 + " = " + (number1 / number2));
            }
        }
    }
