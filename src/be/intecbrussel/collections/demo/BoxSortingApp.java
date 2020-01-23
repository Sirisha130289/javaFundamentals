package be.intecbrussel.collections.demo;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class BoxSortingApp {

    public static void main(String[] args) {
        Box box = new Box(5, 7, 4);
        Box box1 = new Box(8, 6, 8);
        Box box2 = new Box(9, 3, 4);

        SortedSet<Box> boxes = new TreeSet<>();
        boxes.add(box);
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(new Box(10, 5, 12));

        boxes.forEach(System.out::println);

        SortedSet<Box> boxes1 = new TreeSet<>(new Comparator<Box>() {
            public int compare(Box box1, Box box2) {
                return box1.getWidth() - box2.getWidth();
            }
        });


    }


}

