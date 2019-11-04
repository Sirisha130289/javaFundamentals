package com.intec.sirisha;

import java.util.Scanner;


public class StartTimeAndEndTime {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter start hours in 24 hour format, ex: 20 ");
        int startHours = keyboard.nextInt();
        System.out.println("Enter start minutes ");
        int startMinutes = keyboard.nextInt();

        System.out.println("Enter end hours in 24 hour format, ex: 02 ");
        int endHours = keyboard.nextInt();
        System.out.println("Enter end minutes ");
        int endMinutes = keyboard.nextInt();

        int totalHoursWorked = (endHours - startHours);

        if (totalHoursWorked < 0) {
            totalHoursWorked = (totalHoursWorked + 24);

        }

        int totalMinutesWorked = (endMinutes - startMinutes);
        if (totalMinutesWorked < 0) {
            totalMinutesWorked = (totalMinutesWorked + 60);


            totalHoursWorked = totalHoursWorked - 1;

        }
        System.out.println("Total hours = " + totalHoursWorked + " hrs");
        System.out.println("Total minutes = " + totalMinutesWorked + "min");


        int startDay;
        int endDay;
        int startMonth;
        int endMonth;
        System.out.println("Enter the start date");
        startDay= keyboard.nextInt();
        //System.out.println("Enter the start month");
        //startMonth= keyboard.nextInt();
        System.out.println("Enter the End date");
        endDay = keyboard.nextInt();
        //System.out.println("Enter the End month");
        //endMonth = keyboard.nextInt();

        int totalNoOfDays = endDay - startDay;
        System.out.println("Total No of days worked = " + totalNoOfDays);

        //int totalNoOfMonths = endMonth - startMonth;
        //System.out.println("Total No of months worked = " + totalNoOfMonths);

        double wagePerDay = 11.5;
        wagePerDay *= totalNoOfDays;
        System.out.println(wagePerDay);

    }

}

