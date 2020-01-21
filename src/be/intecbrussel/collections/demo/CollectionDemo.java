package be.intecbrussel.collections.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionDemo {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<String>();
        strings.add(new String("First"));
        strings.add("Second");
        strings.add(2, "Third");

//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for (String s : strings) {
            System.out.println(s);
        }
        strings.forEach(System.out::println);
        strings.stream()
                .filter("S"::startsWith)
                .forEach(System.out::println);


    }

}
