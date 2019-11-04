package be.intecbrussel.programming_language.SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] values = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
        int i;
        int j;


        for (i = 0; i < values.length; i++) {// the bubble sort always reduces by one number.
            for (j = 0; j < (values.length - i - 1); j++) {


                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
            System.out.println(java.util.Arrays.toString(values));
        }

    }
}

