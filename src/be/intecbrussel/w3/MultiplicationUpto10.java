package be.intecbrussel.w3;

public class MultiplicationUpto10 {
    public static void main(StringEx[] args) {
        int number = 8;
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + "*" + i + "= " + result);
        }

    }
}
