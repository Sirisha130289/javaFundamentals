package be.intecbrussel.InheritanceChapter10.exercises.ex10_1_2;

public class SquareApp {
      public static void main(String[] args) {
        Square square = new Square(); // creating a square without parameters
        square.setSide(5);
        square.setX(4);
        square.setY(2);
        System.out.println("Area of the square : " + square.getArea());
        System.out.println("Perimeter of the square : " + square.getPerimeter());
    }
}

