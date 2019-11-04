package be.intecbrussel.OOPChapter6.demo;

import java.util.Random;

public class RandomApp {

    public static void main(String[] args) {
        Random random = new Random(1);
        Random random2 = new Random(1);

        System.out.println(random.nextInt(5)-5);
        System.out.println(random2.nextInt());

    }
}
