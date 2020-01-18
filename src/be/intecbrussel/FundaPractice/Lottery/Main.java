package be.intecbrussel.FundaPractice.Lottery;

public class Main {
    public static void main(String[] args) {
        Guess guess = new Guess();
        UserInput userInput = new UserInput();

        int[] numberGenerated = guess.systemGeneratedNumbers();
        int[] userInputedNumbers = userInput.userInputNumbers();
        int count = 0;

        System.out.print("System generated numbers : ");
        for (int i = 0; i < numberGenerated.length; i++) {
            System.out.print(numberGenerated[i]);
        }
        System.out.println();
        System.out.print("User inputted numbers : ");
        for (int i = 0; i < userInputedNumbers.length; i++) {
            System.out.print(userInputedNumbers[i]);
        }


        for (int i = 0; i < numberGenerated.length; i++) {
            if (numberGenerated[i] == userInputedNumbers[i]) {
                count = count++;
            }
        }
        System.out.println();
        System.out.println("You have " + count + " correct guesses");


    }


}
