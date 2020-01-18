package be.intecbrussel.Practice.VendingMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //VendingMachine vm = new VendingMachine();

        Stock stock = new Stock(5);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number 0-4");
        int num = keyboard.nextInt();



       // stock.checkCan(vm.getChoice(2));
    }

}
