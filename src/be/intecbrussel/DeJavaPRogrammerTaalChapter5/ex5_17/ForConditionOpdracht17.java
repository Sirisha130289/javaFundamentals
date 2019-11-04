package be.intecbrussel.DeJavaPRogrammerTaalChapter5.ex5_17;

public class ForConditionOpdracht17 {
    public static void main(String[] args) {
        int a = -10;
        int b = 10;
        int result;
        while (a <= b) {
            result = a <= b ? a : b;
            a++;
            System.out.println(result);
        }
    }
}

