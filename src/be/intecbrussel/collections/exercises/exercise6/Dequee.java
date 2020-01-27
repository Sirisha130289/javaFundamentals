package be.intecbrussel.collections.exercises.exercise6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class Dequee {
    public static void main(String[] args) {

        Deque<String> listOfPeople = new ArrayDeque<>();
        listOfPeople.addFirst("Man1");
        listOfPeople.addFirst("Man2");
        listOfPeople.addFirst("Man3");
        listOfPeople.addFirst("Man4");
        listOfPeople.addFirst("Man5");
        listOfPeople.addLast("Woman1");
        listOfPeople.addLast("Woman2");
        listOfPeople.addLast("Woman3");
        listOfPeople.addLast("Woman4");
        listOfPeople.addLast("Woman5");

        listOfPeople = listOfPeople.stream().sorted().collect(Collectors.toCollection(ArrayDeque<String>::new));

        while (listOfPeople.size() >0) {
            String unit = listOfPeople.pollFirst() + listOfPeople.pollLast();
            System.out.println(unit);

        }

    }
}
