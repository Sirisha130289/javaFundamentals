package be.intecbrussel.inheritancePracticeExercises;

public class SquareArray {

    static int[] square(int numbers[]){
        int[] square = new int[numbers.length];

        for(int i=0; i<numbers.length;i++){

            square[i] = numbers[i]*numbers[i];
        }
        return square;
    }
}
