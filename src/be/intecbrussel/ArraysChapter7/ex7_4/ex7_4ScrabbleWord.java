package be.intecbrussel.ArraysChapter7.ex7_4;

import java.util.Scanner;

public class ex7_4ScrabbleWord {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type a word in upper case and we will calculate the score");
        String word = keyboard.nextLine();


        int lettervalue = 0;

        for (int i = 0; i < word.length(); i++) {
            char calculatedLetter = word.charAt(i);
            switch (calculatedLetter) {
                case 'A':
                case 'E':
                case 'I':
                case 'L':
                case 'N':
                case 'O':
                case 'R':
                case 'S':

                case 'T':
                case 'U':
                    lettervalue += 1;
                    break;
                case 'D':
                case 'G':
                    lettervalue += 2;
                    break;
                case 'B':
                case 'C':
                case 'M':
                case 'P':
                    lettervalue += 3;
                    break;
                case 'F':
                case 'H':
                case 'V':
                case 'W':
                case 'Y':
                    lettervalue += 4;
                    break;
                case 'K':
                    lettervalue += 5;
                    break;
                case 'J':
                case 'X':
                    lettervalue += 8;
                    break;
                case 'Q':
                case 'Z':
                    lettervalue += 10;
                    break;
                default:
                    break;
            }
        }
        System.out.println(lettervalue);
    }

}



