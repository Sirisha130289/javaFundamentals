package be.intecbrussel.programming_language.demo;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        int month;
        int days = 0;
        System.out.println("Enter a month");
        Scanner keyboard = new Scanner(System.in);
        month = keyboard.nextInt();
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                days = 0;
        }
        System.out.println("Number of days in Month: " + days);
    }
}
