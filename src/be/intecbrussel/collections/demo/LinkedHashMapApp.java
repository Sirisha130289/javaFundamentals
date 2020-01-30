package be.intecbrussel.collections.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, Box> boxes = new LinkedHashMap<>();
        boxes.put("Pictures Childhood", new Box());
        boxes.put("Books from my school", new Box());
        boxes.put("My old vinyl records", new Box(12,15,17));
        boxes.put("Love Letters", new Box());

        System.out.println("Contents of my loft: ");
        boxes.entrySet().forEach(System.out::println);
        System.out.println("Lets listen to old records");
        Box records = boxes.get("My old vinyl records");
        System.out.println(records);
    }
}
