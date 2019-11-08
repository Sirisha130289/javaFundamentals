package be.intecbrussel.w3;

public class IntArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {7, 9, 8};
        int[] c = new int[2];

        c[0] = a[0];
        c[1] = b[0];

        System.out.println("c[] = (" +c[0]+","+c[1]+")");


    }

}

