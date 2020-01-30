package be.intecbrussel.collections.demo;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {
        Map<String, Integer> ingredients = new HashMap<>();
        ingredients.put("Potatoes", 5);
        ingredients.put("Carrots", 4);
        ingredients.put("Beans", 2);
        ingredients.put("Chicken", 1);
        System.out.println(ingredients.get("Chicken"));



      //  ingredients.entrySet().forEach(System.out::println);
        //as there are 2 variables String and Integer, normal foreach wont work. we need to use short for loop to print.
        for (String s : ingredients.keySet())
            System.out.println(s + ":" + ingredients.get(s));
    }
}
