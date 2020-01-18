package be.intecbrussel.Practice.VendingMachine;

import java.util.Scanner;

public class VendingMachine {
    private int id;
    private Stock stock;
    private Register register;

    VendingMachine(Stock stock){
        this.stock = stock;
    }

    public Can getChoice(int input) {

        Can choice = null;

        switch (input) {
            case 0:
                choice = Can.COLA;

                break;
            case 1:
                choice = Can.FANTA;
                break;
            case 2:
                choice = Can.ICETEA;
                break;
            case 3:
                choice = Can.SPA;
                break;
            default:
                break;
        }

      return choice;
    }

}
