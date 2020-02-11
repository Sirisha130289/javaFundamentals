package be.intecbrussel.hangman;

public interface DataProviderService {
    String rule1 = "1.Sometimes the gallows are already prepared and only the male has to be drawn";
    String rule2 = "2.In some variations it is not allowed to guess vowels (a-e-i-o-u)";
    String rule3 = "3.Instead of words, it is also possible to target known word combinations ";

    String randomWord();

}
