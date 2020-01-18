package be.intecbrussel.Practice.VendingMachine;

import java.util.Random;

public class Stock {
    private Can[] cans;

    public Stock(int amount) {
        cans = new Can[amount];
        this.initStock(amount);
    }

    public void initStock(int amount) {
        Random random = new Random();

        for (int i = 0; i < amount; i++) {
            int num = random.nextInt(4);
            switch (num) {
                case 0:
                    cans[i] = Can.COLA;
                    break;
                case 1:
                    cans[i] = Can.FANTA;
                    break;
                case 2:
                    cans[i] = Can.ICETEA;
                    break;
                case 3:
                    cans[i] = Can.SPA;
                    break;
                default:
                    break;
            }
        }
    }

    public void printStock() {
        for (int i = 0; i < cans.length; i++) {
            System.out.println(cans[i]);
        }
    }

    public void deleteStock(Can can) {
        for (int i = 0; i < cans.length; i++) {
            if ((cans[i] == Can.COLA) && (can == Can.COLA)) {
                cans[i] = null;
                break;
            } else if ((cans[i] == Can.FANTA) && (can == Can.FANTA)) {
                cans[i] = null;
                break;
            } else if ((cans[i] == Can.ICETEA) && (can == Can.ICETEA)) {
                cans[i] = null;
                break;
            } else if ((cans[i] == Can.SPA) && (can == Can.SPA)) {
                cans[i] = null;
                break;
            }
        }
    }

    public boolean checkCan(Can can) {
        for (int i = 0; i < cans.length; i++) {
            if ((cans[i] == Can.COLA) && (can == Can.COLA)) {
                return true;

            } else if ((cans[i] == Can.FANTA) && (can == Can.FANTA)) {
                return true;

            } else if ((cans[i] == Can.ICETEA) && (can == Can.ICETEA)) {
                return true;

            } else if ((cans[i] == Can.SPA) && (can == Can.SPA)) {
                return true;

            }

        }
        return false;
    }


}
