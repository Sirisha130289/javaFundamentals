package be.intecbrussel.ArraysChapter7.ex7_2;

import java.util.Scanner;

public class ex7_2 {
          public static void main(String[] args) {


            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter a sentence");

            String text = keyboard.nextLine();
            String[] s = text.split(" ");
            System.out.println(s.length);
            for (int i = 0; i < s.length; ) {
                System.out.println(s[i]);
                i++;
            }

        }
    }
