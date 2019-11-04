package be.intecbrussel.OOPChapter6.exercises.ex6_1;

import java.util.Random;

public class LotteryApp1 {

    public static void main(String[] args) {

        //declare the lottery numbers
        int number1 = -1;
        int number2 = -1;
        int number3 = -1;
        int number4 = -1;
        int number5 = -1;
        int number6 = -1;

        //generate six different numbers between 0-45
        number1 = generateNewNumber(number2, number3, number4, number5, number6);
        number2 = generateNewNumber(number1, number3, number4, number5, number6);
        number3 = generateNewNumber(number1, number2, number4, number5, number6);
        number4 = generateNewNumber(number1, number2, number3, number5, number6);
        number5 = generateNewNumber(number1, number2, number3, number4, number6);
        number6 = generateNewNumber(number1, number2, number3, number4, number5);


        //print out the lottery numbers
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        System.out.println("number3:" + number3);
        System.out.println("number4:" + number4);
        System.out.println("number5:" + number5);
        System.out.println("number6:" + number6);

    }

    private static int generateNewNumber(int number1, int number2, int number3, int number4, int number5) {

        //declare and instantiate the random (number generated)

        Random random = new Random();
        boolean randomNumberIsNew = false;
        int randomNumber = 0;
        while (!randomNumberIsNew) {
            randomNumber = random.nextInt(44) + 1;
            //check randomNumber is unique and new random number
            //check if number already exists
            if (randomNumber == number1 || randomNumber == number2 || randomNumber == number3 ||
                    randomNumber == number4 || randomNumber == number5 ) {
                randomNumberIsNew = false;
            }
            //if it does not exixt, make randomNumberIsNew true
            else {
                randomNumberIsNew = true;
            }
        }
        return randomNumber;
    }
}
