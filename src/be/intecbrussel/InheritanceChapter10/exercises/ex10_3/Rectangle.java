package be.intecbrussel.InheritanceChapter10.exercises.ex10_3;

public class Rectangle {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(-5);
        System.out.println("The dimensions of the square are: "+ square.getSide()+"*"+square.getSide());
    }

}
