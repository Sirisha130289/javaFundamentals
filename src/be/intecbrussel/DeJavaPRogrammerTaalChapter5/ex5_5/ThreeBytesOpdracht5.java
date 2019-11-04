package be.intecbrussel.DeJavaPRogrammerTaalChapter5.ex5_5;

public class ThreeBytesOpdracht5 {
    public static void main(String[] args) {

        byte a = 5;
        byte b = 2;
        byte result;
        result = (byte) (a * b);
        System.out.println(result);

        int number1 = 2147483645;
        int number2 = 2147483642;
        int result2;
        result2 = number1 * number2;
        System.out.println(result2);

    }
}
