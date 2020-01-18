package be.intecbrussel.FundaPractice.Lotter1;

/**
 * This is the main class where we compare the system generated numbers with the user inputed numbers
 */
public class MainLottery {
    public static void main(String[] args) {
        Guess guess = new Guess();
        UserNumbers userNumbers = new UserNumbers();
        int count = 0;
        int[] generatedNumbers = guess.randomNumbers();
        int[] userGivenNumbers = userNumbers.userNumbers();

        System.out.println("System given numbers");
        for (int i = 0; i < generatedNumbers.length; i++) {
            System.out.println(generatedNumbers[i]);
        }

        System.out.println("User given numbers");
        for (int i = 0; i < userGivenNumbers.length; i++) {
            System.out.println(userGivenNumbers[i]);
        }
        for (int i = 0; i < generatedNumbers.length; i++) {
            if (generatedNumbers[i] == userGivenNumbers[i]) {
                count = count++;
                System.out.println("You have " + count + " correct guesses");
            }
        }
    }
}
