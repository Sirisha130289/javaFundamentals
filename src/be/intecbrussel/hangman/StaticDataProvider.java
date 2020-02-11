package be.intecbrussel.hangman;

import java.util.Random;

public class StaticDataProvider implements DataProviderService {

    Random random = new Random();
    String[] wordsToBeChoosed = {"Everything", "Basketball", "Perfection", "Television", "Blackboard", "Leadership", "Retirement", "Hello", "Love", "Beautiful"};


    @Override
    public String randomWord() {
        int randomNumber = random.nextInt(wordsToBeChoosed.length);
        return wordsToBeChoosed[randomNumber];
    }
}
