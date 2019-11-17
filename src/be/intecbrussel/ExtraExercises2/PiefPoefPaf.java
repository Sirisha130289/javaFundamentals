package be.intecbrussel.ExtraExercises2;
import java.util.Random;
public class PiefPoefPaf {
    public static void main(String[] args) {
        Random rand = new Random();




        for(int i=0;i<25;i++){
            int number = rand.nextInt(1000);
            System.out.println(number);
        }



    }
}
