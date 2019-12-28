package be.intecbrussel.simpleclassesChapter12.demo;
import java.time.*;

public class InstantApp {
    public static void main(String[] args) {
        System.out.println(Instant.EPOCH); //start date of teh computer.
        System.out.println(Instant.MIN);
        System.out.println(Instant.MAX);

        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); //milli=one second/1000(which is 10^-3, micro - 10^-6, nano= 10^-9

        Instant earlier = now.minusSeconds(20);
        System.out.println(earlier);

        Instant later = now.plusSeconds(20);
        System.out.println(later);

        System.out.println(now.isAfter(earlier));
        System.out.println(now.isBefore(later));
    }
}