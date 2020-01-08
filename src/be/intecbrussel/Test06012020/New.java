package be.intecbrussel.Test06012020;


import java.util.InputMismatchException;
import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int answer = 0;
        while (true) {
            
            try {
               answer = keyboard.nextInt();
               break;
            } catch (InputMismatchException ime) {
                System.out.println("Please enter a valid input");
                keyboard.next();
            }


        }


    }
}
