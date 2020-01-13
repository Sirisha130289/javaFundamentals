package be.intecbrussel.LambdaExpression.Demo;

import java.util.Random;

@FunctionalInterface
public interface RandomMath {

    public int random();

    public static void main(String[] args) {

        Random random1 = new Random();
        RandomMath randomMath = () -> random1.nextInt();
        System.out.println(randomMath.random());
    }
}
