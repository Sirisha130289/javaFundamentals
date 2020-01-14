package be.intecbrussel.StreamAPI;

import java.util.stream.Stream;

public class StreamApiExample {
    public static void main(String[] args) {
        String[] words = {"Hello", "this", "is", "an", "example", "of", "streams"};            // collection of string in the form of an array.
        Stream.of(words).forEach(System.out::println);                                  //transforming this into a stream using the Stream.of() method
        Stream<String> stream = Stream.of(words);
        stream.forEach(System.out::println);
        Stream<String> stream1= Stream.generate(()->"Hello World");

    }

}
