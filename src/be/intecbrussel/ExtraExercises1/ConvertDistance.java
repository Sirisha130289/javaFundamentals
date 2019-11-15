package be.intecbrussel.ExtraExercises1;

import java.util.Scanner;

public class ConvertDistance {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the total distance in meters");
        double distance = keyboard.nextDouble();
        System.out.println("Please enter the total hours 1-12");
        int hours = keyboard.nextInt();
        System.out.println("Please enter the minutes 0-60");
        int minutes = keyboard.nextInt();
        System.out.println("Please enter the seconds 0-60");
        int seconds = keyboard.nextInt();

        double metersPerSecond = distance / ((hours * 3600) + (minutes * 60) + seconds);
        double kmPerHour = (distance / 1000) / (hours + (minutes / 60d) + (seconds / 3600d));
        double oneMile = 1609;
        double totalMiles = distance / oneMile;
        double milesPerHour = totalMiles / (hours + (minutes / 60d) + (seconds / 3600d));

        System.out.println("Your speed in meters/second : " + metersPerSecond);
        System.out.println("Your speed in km/hr : " + kmPerHour);
        System.out.println("Your speed in mph : " + milesPerHour);
    }


}
