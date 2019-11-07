package be.intecbrussel.w3;
import java.util.Scanner;
public class Average {
    public static void main(StringEx[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int number1 = keyboard.nextInt();
        System.out.println("Please enter the second number");
        int number2=keyboard.nextInt();
        System.out.println("Please enter the third number");
        int number3=keyboard.nextInt();
        int average = (number1+number2+number3)/3;
        System.out.println("Average is : " +average);
    }


}
