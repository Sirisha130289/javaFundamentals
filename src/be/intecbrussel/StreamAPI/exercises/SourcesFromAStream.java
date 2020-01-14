package be.intecbrussel.StreamAPI.exercises;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SourcesFromAStream {
    public static void main(String[] args) {
        String[] drawingRecords = {"Book1", "Book2", "Book3"};
        Stream.of(drawingRecords).forEach(System.out::println);

        IntStream intStream = IntStream.range(0,100);
       intStream.forEach(System.out::println);
        }
    }




