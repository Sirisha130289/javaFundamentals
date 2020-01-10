package be.intecbrussel.generic_method;

public class GenericMethod {
    public static <T extends Comparable<T>, V extends T> String showResult(T number, T[] array) {
        String result = " ";
        for (int i = 0; i < array.length; i++) {

            if (number.equals(array[i])) {
                result = "This number is in the array";
                break;
            } else {
                result = "This number is not in the array";
                break;
            }


        }
        return result;
    }
}


