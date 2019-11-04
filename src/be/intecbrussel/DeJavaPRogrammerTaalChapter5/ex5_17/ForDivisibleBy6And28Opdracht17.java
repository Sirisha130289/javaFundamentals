package be.intecbrussel.DeJavaPRogrammerTaalChapter5.ex5_17;

public class ForDivisibleBy6And28Opdracht17 {
    public static void main(String[] args) {
        int number;
        for (number = 1; number <= 10000; number++)

            if (number % 6 == 0 && number % 28 == 0) {
                System.out.println(number);
            }
    }
}

