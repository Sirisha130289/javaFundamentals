package be.intecbrussel.simpleclassesChapter12.exercises;

import be.intecbrussel.enumsChapter11.Day;

import java.sql.Date;
import java.time.*;
import java.util.Scanner;

public class ex4_12 {
    public static void main(String[] args) {

        LocalDate dob = LocalDate.of(1989, 2, 13);

        System.out.println(dob.getDayOfYear());
        System.out.println(dob.getDayOfMonth());
        System.out.println(dob.getDayOfWeek());
        System.out.println(dob.isLeapYear());


    }
}
