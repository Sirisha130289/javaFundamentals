package be.intecbrussel.ArraysChapter7.ex7_3;

public class ex7_3ProductOfArrays {
    public static void main(String[] args) {
        int[][] numbers = new int[4][6];

        int i, j;

        for (i = 0; i < numbers.length; i++) {
            for (j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = i * j;

            }
        }
        for (i = 0; i < numbers.length; i++) {
            for (j = 0; j < numbers[i].length; j++) {
                System.out.println("numbers[" + i + "][" + j + "]" + numbers[i][j]);
            }
        }
    }
}
