package be.intecbrussel.hangman;

import java.io.*;
import java.util.Scanner;

public class HangManMain {

    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic();
        UserDetails userDetails = new UserDetails();
        userDetails.storeUserData();
        gameLogic.startGame();
        gameLogic.playGame();
        
    }


}