package be.intecbrussel.programming_language.demo;

import java.util.Scanner;

public class PanCakeWhile {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Take flour");
        System.out.println("Add milk");
        System.out.println("Add eggs");
        System.out.println("Mix");

        int hungry = 0;
        while (hungry < 10) {
            System.out.println("Bake");
            hungry++;
        }
    }
}
