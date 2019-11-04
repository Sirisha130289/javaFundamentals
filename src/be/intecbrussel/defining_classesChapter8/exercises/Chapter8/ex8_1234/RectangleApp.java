package be.intecbrussel.defining_classesChapter8.exercises.Chapter8.ex8_1234;

public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("This program uses a rectangle");
        Rectangle rect = new Rectangle();

        rect.height = 1.50;
        rect.width = 3.50;
        rect.x=1;
        rect.y=4;


        System.out.println("the height of the rectangle: " + rect.height);
        System.out.println("the width of the rectangle: " + rect.width);
        System.out.println("the position is:( " + rect.x + "," + rect.y + ")" );

        Rectangle rect2 = new Rectangle();
        rect2.height =4.5;
        rect2.width = 5.5;
        rect2.x=3;
        rect2.y=5;

        System.out.println("the height of the rectangle 2: " + rect2.height);
        System.out.println("the width of the rectangle 2: " + rect2.width);
        System.out.println("the position is:( " + rect2.x + "," + rect2.y + ")" );
    }
}
