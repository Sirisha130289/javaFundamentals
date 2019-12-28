package be.intecbrussel.simpleclassesChapter12.demo;


public class AutoBoxingAssignment {
    public static void main(String[] args) {
        Integer a1 = 5;
        Integer a2 = 5;
        Integer b1 = 500;
        Integer b2 = 500;


        System.out.println(a1 == a2); // this falls in the range of -128 to 127 so, this will be true.
        System.out.println(a1 != a2);

        System.out.println(b1 == b2);
        System.out.println(b1 != b2);

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        int minValue = Integer.MIN_VALUE;
        System.out.println(minValue);

        float floatNaN = Float.NaN;
        System.out.println(floatNaN);

        float negativeInfinity = Float.NEGATIVE_INFINITY;
        System.out.println(negativeInfinity);

        float positiveInfinity = Float.POSITIVE_INFINITY;
        System.out.println(positiveInfinity);

        double negativeeInfinity = Double.NEGATIVE_INFINITY;
        System.out.println(negativeeInfinity);

        double positiveeInfinity = Double.POSITIVE_INFINITY;
        System.out.println(positiveeInfinity);

        int parseInt = Integer.parseInt("4"); //converts string into int if possible
        System.out.println(parseInt);

        float parseFloat = Float.parseFloat("4.25"); //converts string into int if possible
        System.out.println(parseFloat);


    }
}