package be.intecbrussel.exceptionsChapter12;

public class LearnExceptions {

    public static void main(String[] args) {

        callMethod1();

        System.out.println("This message is important and should be printed");
    }

    private static void callMethod1() {

        callMethod2();
    }

    private static void callMethod2() {

        callMethod3();
    }

    private static void callMethod3() {

        System.out.println(1 / 0);
    }
}
