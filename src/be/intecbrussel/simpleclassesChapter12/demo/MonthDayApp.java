package be.intecbrussel.simpleclassesChapter12.demo;

import java.time.*;

public class MonthDayApp {
    public static void main(String[] args) {
        for (Month m : Month.values()) {
            {
                System.out.format("%s : [%d,%d] %n", m, m.minLength(), m.maxLength());
            }
            for (DayOfWeek d : DayOfWeek.values()) {
                System.out.format("%s %n", d);
            }
        }
    }
}