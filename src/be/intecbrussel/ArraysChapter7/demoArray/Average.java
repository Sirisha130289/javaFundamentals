package be.intecbrussel.ArraysChapter7.demoArray;

public class Average {
    public static void main(String[] args) {
        double[] numbers = {10.0, 20.3, 13.2, 15.2, 16.3};
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = (result + numbers[i]) / numbers.length;
        }
        System.out.println((result));

    }
}
