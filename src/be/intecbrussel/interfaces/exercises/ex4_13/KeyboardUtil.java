package be.intecbrussel.interfaces.exercises.ex4_13;

import java.util.Scanner;

public class KeyboardUtil implements KeyboardInterface {

    Scanner keyboard = new Scanner(System.in);


    @Override
    public double getHeight() {
        System.out.println("Please enter your height in meters");
        return keyboard.nextDouble();
    }

    @Override
    public double getWeight() {
        System.out.println("Please enter your weight in kgs");
        return keyboard.nextDouble();
    }
}
