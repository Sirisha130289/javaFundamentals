package be.intecbrussel.InheritanceChapter10.exercises.ex10_1_2;

public class Square extends SquareApp { // inheritance, being Square is the sub class of SquareApp(superclass)
    private int side;
    private double area;
    private double perimeter;
    private int x;
    private int y;


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * area;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
