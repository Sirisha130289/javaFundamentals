package be.intecbrussel.inheritancePracticeExercises;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 21, 25, 26, 28, 98, 15, 18, 19, 34, 16, 19, 21, 98, 78};




        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        System.out.println("The sum of given arrays is :" +sum);

        int[] resverseA = ReverseArray.reverse(numbers);

        System.out.println("The given arrays is : " + Arrays.toString(numbers));
        System.out.println("The reverse array is: "+Arrays.toString(resverseA));

        int[] square = SquareArray.square(numbers);

        System.out.println("The square array is : "+ Arrays.toString(square));
    }
}
