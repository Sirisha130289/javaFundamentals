package be.intecbrussel.programming_language.demo;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        //declarations and initializations of variables
        Scanner keyboard = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int sum= 0;
        int multiplication = 0;

        //put the inputs inside of the variables
        System.out.println("Please enter a first number");
        a= keyboard.nextInt();
        System.out.println("Please enter a second number");
        b= keyboard.nextInt();

        //compute the sum
        sum = a+b;
        multiplication= a*b;

        //print out the sum
        System.out.println("The sum of your 2 numbers = " +sum);
        System.out.println("The multiplication of your 2 numbers = " + multiplication);
    }


}
