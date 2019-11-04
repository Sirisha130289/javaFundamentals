package be.intecbrussel.ArraysChapter7.ex7_1;

public class ex7_1 {
    public static void main(String[] args) {

        int[] primeNumbers = new int[100];
        int count = 0;
        int i;


        for (i = 1; i <= 100; i++) {
            boolean isModulus0 = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isModulus0 = false;
                    break;
                }

            }
            if (isModulus0 == true) {
                primeNumbers[count] = i;
                count++;
            }
        }

        for (int index = 0; index < primeNumbers.length; index++) {

            if (primeNumbers[index] != 0) {
                System.out.println(primeNumbers[index]);
            }
        }
        for (int k = 101; k <= 1000; k++) {
            boolean isModulusPrime = true;
            for (int index = 1; index < primeNumbers.length; index++) {

                if (primeNumbers[index] != 0) {
                    if (k % primeNumbers[index] == 0) {
                        isModulusPrime = false;
                        break;

                    }
                }


            }
            if (isModulusPrime) {
                System.out.println(k);
            }
        }
    }


}
