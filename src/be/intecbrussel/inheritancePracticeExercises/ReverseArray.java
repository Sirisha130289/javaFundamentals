package be.intecbrussel.inheritancePracticeExercises;

public class ReverseArray {
    static int[] reverse(int numbers[]) { // the array to be reversed and the length of the array

        int[] reverse = new int[numbers.length];
        int temp = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            reverse[temp - 1] = numbers[i];
            temp = temp - 1;
        }
        return reverse;
    }
}
