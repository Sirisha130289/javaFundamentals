package be.intecbrussel.simpleclassesChapter12.demo;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class TimeZone {
    public static void main(String[] args) {
       ZoneId zoneId = ZoneId.of("Europe/Brussels");
        System.out.println(zoneId);

        ZoneId systemZoneID = ZoneId.systemDefault();
        System.out.println(systemZoneID);

        ZoneOffset timeZone = ZoneOffset.ofHours(2);
        System.out.println(timeZone);

    }
}