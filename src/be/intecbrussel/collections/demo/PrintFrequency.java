package be.intecbrussel.collections.demo;

import java.util.*;

public class PrintFrequency {

    static void printFrequency(int array[]) {

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            Integer count = hmap.get(array[i]);

            if (hmap.get(array[i]) == null) {
                hmap.put(array[i], 1);
            } else {
                hmap.put(array[i], ++count);
            }
            for (Map.Entry m : hmap.entrySet())
                System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
        }
    }

    public static void main(String[] args) {


        int array[] = {10, 5, 15, 10, 5, 5, 5, 10, 1, 0, 16, 15, 15, 10, 5, 2, 3};
        printFrequency(array);
    }
}
