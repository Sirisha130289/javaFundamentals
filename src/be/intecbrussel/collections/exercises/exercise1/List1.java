package be.intecbrussel.collections.exercises.exercise1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class List1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        java.util.List<Integer> inputList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter number");
            int num = scan.nextInt();
            inputList.add(num);
        }

        inputList.forEach(System.out::println);
        System.out.println(inputList.stream().mapToDouble(a -> a).sum());
        System.out.println(inputList.stream().mapToDouble(a -> a).average().getAsDouble());

        int sum = 0;
        for (int i = 0; i < inputList.size(); i++) {
            sum = sum + inputList.get(i);
        }

        System.out.println("Sum : " + sum);
        System.out.println("avg : " + sum * 1d / inputList.size() * 1d);

        String sentence = null;
        java.util.List<String> sentenceList = new ArrayList<>();
        do {
            System.out.println("Please enter a sentence ending with .");
            sentence = scan.next();
            if (sentence.endsWith(".")) {
                break;
            } else {
                System.out.println("adding word  : " + sentence);
                sentenceList.add(sentence);
            }
        } while (true);

        sentenceList.forEach(System.out::println);
        java.util.List<String> reverseList = new ArrayList<>();
        for (int i = sentenceList.size() -1; i >= 0; i--) {
            reverseList.add(sentenceList.get(i));
        }

        reverseList.forEach(System.out::println);
    }

}
