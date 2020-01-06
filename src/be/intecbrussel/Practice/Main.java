package be.intecbrussel.Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter anumber between 1-10");
        int guessNumber = keyboard.nextInt();

        int count =0;
        while(guessNumber<=0||guessNumber>10){
            System.out.println("Please enter a number between 1-10");
            guessNumber = keyboard.nextInt();
        }


    }
}
