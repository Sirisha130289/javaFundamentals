package be.intecbrussel.collections.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionMain {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("Kalyan");
        collection.add("Sirisha");
        collection.add("Satwika");


        System.out.println(collection.size());

        List<String> list = new ArrayList<>();
        list.add("Kalyan");
        list.add("Sirisha");
        list.add("Satwika");

        System.out.println(list.size());

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Kalyan");
        arrayList.add("Sirisha");
        arrayList.add("Satwika");

        String[] array = list.toArray(new String[0]);
        String[] anotherArray = list.toArray(String[]::new);

        String[] names = {"Kalyan", "Sirisha", "Satwika"};

        List<String> namesList = Arrays.asList(names);


        System.out.println(arrayList.size());

        list.add("name");
        list.remove("name");
        list.remove(1);

        boolean exists = list.contains("name");

        list.indexOf("name");
// list.isEmpty() is same as list.size() == 0

        list.get(0);

        list.add("something");
        list.add("anmoher");
        list.add("eekls");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // array is array[i], but list is list.get(i)

        }

        list.forEach(System.out::print);

    }
}
