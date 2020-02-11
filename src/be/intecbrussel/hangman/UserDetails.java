package be.intecbrussel.hangman;

import java.util.*;
import java.io.*;

public class UserDetails implements Serializable {

    Scanner keyboard = new Scanner(System.in);
    String userName = new String();
    char[] correctPassword;
    String position;
    UserDetails userDetails;


    public void storeUserData() {
        System.out.println("Give the login details:");
        System.out.println("Enter the Username");
        userName = keyboard.next();
        System.out.println("User Name is: " + userName);
        System.out.println("Enter the passsword");
        correctPassword = keyboard.next().toCharArray();
        System.out.println("Password is: " + correctPassword[0]);


        try {
            FileOutputStream fs = new FileOutputStream(userName + ".ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(userName);
            os.writeObject(correctPassword);
            os.writeObject(position);
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\SIRISHAA\\IdeaProjects\\javaFundamentals.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            userDetails = (UserDetails) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (Exception c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + userName);

    }

}
