package be.intecbrussel.OOPChapter6.exercises.ex6_1;
import java.util.Random;
public class LotteryApp2 {

    public static void main(String[] args) {
        Random random = new Random();
        //declare the lottery numbers
        int number1 = -1;
        int number2 = -1;
        int number3 = -1;
        int number4 = -1;
        int number5 = -1;
        int number6 = -1;

        number1 = random.nextInt(44) + 1;
        number2 = random.nextInt(44) + 1;
        number3 = random.nextInt(44) + 1;
        number4 = random.nextInt(44) + 1;
        number5 = random.nextInt(44) + 1;
        number6 = random.nextInt(44) + 1;

        //print out the lottery numbers
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        System.out.println("number3:" + number3);
        System.out.println("number4:" + number4);
        System.out.println("number5:" + number5);
        System.out.println("number6:" + number6);
    }
}