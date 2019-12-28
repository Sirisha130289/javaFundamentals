package be.intecbrussel.simpleclassesChapter12.exercises;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.*;

public class ex3_12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a weekday(1-7)");
        int weekday = keyboard.nextInt();

        System.out.println(DayOfWeek.of(weekday));

        System.out.println("Add no of days");
        int addDays = keyboard.nextInt();

        System.out.println(DayOfWeek.of(weekday).plus(addDays));

    }
}
