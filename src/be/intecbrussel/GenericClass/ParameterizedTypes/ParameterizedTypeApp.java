package be.intecbrussel.GenericClass.ParameterizedTypes;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedTypeApp {
    public static void main(String[] args) {
        Box<Integer,List<String>> box = new Box<Integer, List<String>>();

        List<String> messages = new ArrayList<String>();

        messages.add("Hi");

        messages.add("Welcome");
        box.add(Integer.valueOf(10),messages);
        System.out.println(box.getT());
        System.out.println(box.getS());

    }



}
