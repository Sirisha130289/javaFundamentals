package be.intecbrussel.OOPChapter6.exercises.ex6_1;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();
        Random random2 = new Random();


        int randomNumber = random.nextInt();
        System.out.println(randomNumber);

        int randomNumber2 = random2.nextInt(10);
        System.out.println(randomNumber2);



    }
}

