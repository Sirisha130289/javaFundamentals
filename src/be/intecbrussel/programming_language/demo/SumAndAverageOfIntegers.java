package be.intecbrussel.programming_language.demo;

public class SumAndAverageOfIntegers {
    public static void main(String[] args) {
        int sum = 0;       // store the accumulated sum
        int lowerbound = 1;
        int upperbound = 1000;
        double average;

        // Use a for-loop to accumulate the sum
        for (int number = lowerbound; number <= upperbound; ++number) {
            // number = lowerbound, lowerbound+1, lowerbound+2, ..., upperbound for each iteration
            sum += number;
        }
        System.out.println(sum);
    }
}


