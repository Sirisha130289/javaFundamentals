package be.intecbrussel.OOPChapter6.ex6_5;

public class ex6_5 {
    public static void main(String[] args) {
        int meter = 100;
        float feet = 3.28f;




        for (meter = 100; meter <= 550; ) {

            System.out.println(String.format("%d meter = %.2f feet " ,meter,feet));
            meter+=50;
            feet+= 1.64f;

        }

    }
}
