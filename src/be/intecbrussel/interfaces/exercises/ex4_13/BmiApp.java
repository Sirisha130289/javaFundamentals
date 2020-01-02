package be.intecbrussel.interfaces.exercises.ex4_13;

public class BmiApp {
    public static void main(String[] args) {
        KeyboardUtil keyboardUtil = new KeyboardUtil();
        double height = keyboardUtil.getHeight();
        double weight = keyboardUtil.getWeight();

        BmiUtil bmiUtil = new BmiUtil();

        bmiUtil.calculateBMI(height,weight);

    }
    }

