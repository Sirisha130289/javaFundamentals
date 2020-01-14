package be.intecbrussel.Lambdas;

public class LambdaTest {

//    private static double[] firstList;
//    private static double[] secondList;


    public static final ArrayProcessor sum = array -> {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    };


    public static final ArrayProcessor average = array -> {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            average = (sum / array.length);
        }
        return average;
    };
    public static final ArrayProcessor minimum = array -> {
        double minimum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                minimum = array[i];
            }
        }
        return minimum;
    };

    public static final ArrayProcessor maximum = array -> {
        double maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;

    };


    public static ArrayProcessor counter(double value) {

        return array -> {
            int count = 0;
            for (int i = 0; i < array.length; i++) {

                    if (array[i] ==value) {
                        count++;
                    }
                }


            return count;
        };
    }
}