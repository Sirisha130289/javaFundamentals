package be.intecbrussel.Lambdas;

public class LambdaTestMain {
    public static void main(String[] args) {

        LambdaTest lambdaTest = new LambdaTest();

        double[] firstList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] secondList = {17.0, 3.14, 17.0, -3.4, 17.0, 42.0, 29.2, 3.14};



        System.out.println("Sum of first list :" + lambdaTest.sum.apply(firstList));
        System.out.println("Average of first list :" + lambdaTest.average.apply(firstList));
        System.out.println("Minimum of second list :" + lambdaTest.minimum.apply(secondList));
        System.out.println("Maximum of second list :" + lambdaTest.maximum.apply(secondList));

        System.out.println();

        System.out.println("Count of 17.0 in second list :" + lambdaTest.counter(17.0).apply(secondList));
        System.out.println("Count of 20.0 in second list :" + lambdaTest.counter(20.0).apply(secondList));
        System.out.println("Count of 5.0 in first list :" + lambdaTest.counter(5.0).apply(firstList));




    }
}
