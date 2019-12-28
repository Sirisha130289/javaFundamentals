package be.intecbrussel.simpleclassesChapter12.exercises;

import java.time.*;

public class ex2_12 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant addSeconds = now.plusSeconds(7).plusMillis(5).plusNanos(3);
//       Instant addMilliseconds = addSeconds.plusMillis(5);
//       Instant addNanoseconds = addMilliseconds.plusNanos(3);

        System.out.println(now);
        System.out.println(addSeconds);
//        System.out.println(addMilliseconds);
//        System.out.println(addNanoseconds);


    }
}
