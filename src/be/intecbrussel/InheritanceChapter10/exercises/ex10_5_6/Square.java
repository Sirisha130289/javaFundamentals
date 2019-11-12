package be.intecbrussel.InheritanceChapter10.exercises.ex10_5_6;

public class Square extends Rectangle {

    private int side;
    private int x;
    private int y;

    public static int getSquareCount() {
        return squareCount;
    }

    private static int squareCount;

    //default constructor
    Square() {
squareCount++;
    }

    //constructor with side as arguments
    Square(int side) {
        this(side, side, side);              //  when you want to call another constructor with arguments from the lease argument constructor,
        //you need to type the variable name the same times
        //as specified in the most specified argument constructor

    }

    //constructor with side and position as arguments
    Square(int side, int x, int y) {
        this.side = side;
        this.x = x;
        this.y = y;
squareCount++;
    }


    //creating a new square with an existing square
    Square(Square s) {
        this.side = s.side;
        this.x = s.x;
        this.y = s.y;
squareCount++;
    }

    @Override
    public String toString() {          //overrides toString method from object class and prints the class name and properties of the object in sysout.
        return "Square{" +
                "side=" + side +
                ", x=" + x +
                ", y=" + y +
                ", squarecount=" + squareCount +
                '}';
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
