package be.intecbrussel.ArraysChapter7;

public class SumAvgOfArrays {
    public static int average(int... values) {
        int total = 0;
        for (int numbers : values) {
            total += numbers;
        }
        int avg = 0;
        if (values.length != 0) {
            avg = total / values.length;

        }
        return avg;
    }

    public static void main(String[] args) {
        System.out.println(average(4,7,9));
        System.out.println(average(7,9,2,3,5));
        System.out.println(average(3,8,6,9,4,7));
        System.out.println(average());
        int[]values ={3,8,6,9,4,7};
        System.out.println(average(values));
    }
}
