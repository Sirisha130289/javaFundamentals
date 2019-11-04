package be.intecbrussel.ArraysChapter7.ex7_5;

public class ex7_5Statistics {
    public static int average(int... values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        int average = 0;
        if (values.length != 0) {
            average = total / values.length;
        }
        return average;
    }

    public static int min(int... values) {
        int minimum = values[0];
        for (int numbers = 0; numbers < values.length; numbers++) {
            if (values[numbers] < minimum) {
                minimum = values[numbers];
            }

        }
        return minimum;
    }

    public static int max(int... values) {
        int maximum = values[0];
        for (int numbers = 0; numbers < values.length; numbers++) {
            if (values[numbers] > maximum) {
                maximum = values[numbers];
            }

        }
        return maximum;
    }

    public static void main(String[] args) {
        System.out.println(average(2, 3, 4, 5));
        System.out.println(min(2, 3, 4, 5));
        System.out.println(max(2, 3, 4, 5));
    }
}

