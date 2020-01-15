package be.intecbrussel.StreamAPI.Demo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] names = {"Sirisha", "Kalyan", "Satwika"}; //my Array
        Integer[] ids = {1, 34, 57, 99, 90};
        Stream<String> nameStream = Stream.of(names); // Stream of generic type = Stream.of ( array )
        Stream<Integer> idStream = Stream.of(ids);

        //     Stream.of(names).forEach(System.out::println); // forEach can be applied on a stream

        // long count =   nameStream.count(); // this is nothing by array.length . count method is a terminal operation
        //   System.out.println(count); // count

        // nameStream.filter(s -> s.contains("K")).forEach(System.out::println); // Only if there an terminal operation, the intermediate operation will run

        // This concept is called lazy/eager initialization
        // Terminal operation is an eager operation , the moment it is executed, it will run
        // Intermediate operation is an lazy operation, it will not run until terminal operation is foun
        // d

        // nameStream.filter(s->s.contains("a")).filter(s->s.length()>6).forEach(System.out::println);
        nameStream.sorted((s1, s2) -> s2.compareTo(s1)).forEach(System.out::println); // using a lambda we can sort the stream.
// there are 2 sorted methods, default is one which sorts in ascending order and the other method takes Comparator as a lambda expression.

      /*  ##### - Kinds of Streams

        Stream<T> -  Stream of object, which can be String, wrapper classes like Integer, Double etc.
        IntStream - Stream of primitive ints
        DoubleStream - Stream of primitive doubles
        LongStream - Stream of primitive longs

        */

      int[] intArray = {1, 2, 3, 4, 5};
      IntStream intStream = IntStream.of(intArray);

        System.out.println(intStream.average().getAsDouble());


    }
}