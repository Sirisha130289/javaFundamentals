package be.intecbrussel.ArraysChapter7;
import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        int days = 0;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Please enter the month");
        int month = keyboard.nextInt();

        switch (month) {
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
            case 1:
                days = 31;
                break;
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            default:
                days = 0;
                break;
        }

        System.out.println("The no of days in month:" +days);
    }
}
