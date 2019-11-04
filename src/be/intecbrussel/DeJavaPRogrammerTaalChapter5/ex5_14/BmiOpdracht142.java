package be.intecbrussel.DeJavaPRogrammerTaalChapter5.ex5_14;

import java.util.Scanner;

public class BmiOpdracht142 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your height in meters");
        double height = keyboard.nextDouble();
        System.out.println("Enter your weight in kgs");
        double weight = keyboard.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 20) {
            System.out.println("Underweight");
        } else if (bmi > 20 && bmi < 25) {
            System.out.println("Ok");
        } else if (bmi > 25 && bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi > 30 && bmi < 40) {
            System.out.println("Obese");
        } else if (bmi > 40) {
            System.out.println("Certainly Overweight");
        }
    }

}
