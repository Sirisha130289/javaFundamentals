package be.intecbrussel.programming_language.SortingAlgorithms;

public class CombSort {

    public static void main(String[] args) {
        int values[] = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};// enter the values to be sorted in an array
        double shrink = 1.3; // The shrink factor has been empirically found to be 1.3 (by testing Combsort on over 200,000 random lists) [Source: Wiki]
        double gap = (int) (values.length) / shrink;
        while (gap > 1) {
            int i = 0;
            int j = (int) Math.floor(gap); // converting double to int we use (int).
            while (j != values.length) {
                if (values[i] > values[j]) { //if the LHS value is greater than RHS , it should be swapped, else no.
                    values[i] = values[i] ^ values[j];
                    values[j] = values[j] ^ values[i];
                    values[i] = values[i] ^ values[j];
                }
                i++;
                j++;
            }
            gap = gap / shrink;// everytime the gap shrinks by the shrink factor and the new gap is calculated.

            if (gap < 1) {
                gap = 1;
            }
            System.out.println(java.util.Arrays.toString(values));
        }
    }
}

