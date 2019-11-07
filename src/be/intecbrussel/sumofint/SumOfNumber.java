package be.intecbrussel.sumofint;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfNumber {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a integer");
        int number = scan.nextInt();

        if (number < 0){
            number = Math.abs(number); // This is like number = number * -1 if number is negative
        }
        String str = String.valueOf(number);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            String slice = str.substring(i, i + 1);
            int sliceNum = Integer.valueOf(slice);
            result += sliceNum;
        }

        System.out.println("Sum of number : " + number + " is : " + result);

    }
}

