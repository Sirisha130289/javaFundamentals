package be.intecbrussel.bounded_types;

public class StatisticsApp {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{3, 4, 5, 6, 7};
        Double[] array2 = {1.2, 2.3, 3.4, 4.5, 5.6};
        Statistics<Integer> statistics = new Statistics<>(array);
        Statistics<Double> statistics2 = new Statistics<>(array2);
        System.out.println(statistics.average());
        System.out.println(statistics2.average());

        System.out.println(statistics.sameAvg(statistics2));
    }
}
