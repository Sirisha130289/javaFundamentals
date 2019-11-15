package be.intecbrussel.ExtraExercises1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CircusMalpertus {

    public static boolean isWeekdays(int day1) {
        if (day1 < 6) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isSpecialDay(int day1) {
        if (day1 == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {


        int basicPricePerShow = 25;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Select the day of the week :");
        System.out.println("1-Monday");
        System.out.println("2-Tuesday");
        System.out.println("3-Wednesday");
        System.out.println("4-Thursday");
        System.out.println("5-Friday");
        System.out.println("6-Saturday");
        System.out.println("7-Sunday");

        int dayOfTheWeek = keyboard.nextInt();

        System.out.println("Select the show : ");
        System.out.println("1-Afternoon Show");
        System.out.println("2-Evening Show");
        int show = keyboard.nextInt();

        System.out.println("Enter the age of the Customer");
        int age = keyboard.nextInt();

        double priceToBePaid = 0;

        if (age < 12 && isSpecialDay(3) && show == 1) {
            priceToBePaid = (basicPricePerShow - basicPricePerShow * (15d / 100)) / 2;
        } else if (age < 12 && isSpecialDay(3) && show == 2) {
            priceToBePaid = 0;
        } else if (age < 12 && isWeekdays(6) && (show == 1 || show == 2)) {
            priceToBePaid = basicPricePerShow / 2;
        } else if (age < 12 && !(isWeekdays(6) || isSpecialDay(3)) && (show == 1 || show == 2)) {
            priceToBePaid = 0;
        }
        if ((age > 12 && age < 65) && show == 1) {
            priceToBePaid = (basicPricePerShow - basicPricePerShow * (15d / 100));
        } else if ((age > 12 && age < 65) && show == 2) {
            priceToBePaid = basicPricePerShow;
        }


        if (age > 65 && show == 1) {
            priceToBePaid = (basicPricePerShow - basicPricePerShow * (15d / 100) - ((basicPricePerShow - basicPricePerShow * (15d / 100)) * (30d / 100)));
        } else if (age > 65 && show == 2) {
            priceToBePaid = basicPricePerShow - (basicPricePerShow * (30d / 100));
        }
        System.out.println("The price to be paid in euors is: " + priceToBePaid);
    }
}