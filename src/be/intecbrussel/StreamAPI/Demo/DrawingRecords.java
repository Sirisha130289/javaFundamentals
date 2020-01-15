package be.intecbrussel.StreamAPI.Demo;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DrawingRecords {
    public static void main(String[] args) {
        String[] drawingRecords = {"a", "b", "c", "d", "e"};

        Stream.of(drawingRecords).forEach(System.out::println);

        IntStream intStream = IntStream.range(0, 100);
        intStream.forEach(System.out::println);

        IntStream countStream = IntStream.rangeClosed(0, 10);
        System.out.println(countStream.count());
        ;

        OptionalInt max = IntStream.rangeClosed(0, 10).max();
        if (max.isPresent()) {
            System.out.println(max.getAsInt());
        } else {
            System.out.println("No results");
        }

        OptionalInt min = IntStream.rangeClosed(0, 10).min();
        if (min.isPresent()) {
            System.out.println(min
                    .getAsInt());
        } else {
            System.out.println("No results");
        }

        int sum = IntStream.rangeClosed(0, 10).sum();


        OptionalDouble average = IntStream.rangeClosed(0, 10).average();
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        }

        int reduce = IntStream.rangeClosed(1, 10).reduce(2, (a, b) -> a * b);
        System.out.println(reduce);

        String[] drawingRecords1 = {"a", "b", "c", "v", "a"};

        Optional<String> output = Stream.of(drawingRecords1).reduce((r1, r2) -> r1.concat(";").concat(r2));

        if (output.isPresent()) {
            System.out.println(output.get());
        }
    }

}
