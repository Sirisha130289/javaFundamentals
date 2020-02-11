package be.intecbrussel.hangman;

import java.util.Scanner;

public class ConsoleReader implements InputService {

    Scanner keyboard = new Scanner(System.in);
    @Override
    public void playerName() {
        System.out.println("Please enter the player name:");
        String playerName = keyboard.next();
    }
}
