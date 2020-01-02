package be.intecbrussel.interfaces.exercises.ex4_13;

public class BmiUtil implements BmiUtilInterface {
    @Override
    public void calculateBMI(double height, double weight) {

        double BMI = (weight/(height*height)*10000);
        System.out.println("Your BMI is " + BMI);
    }


}
