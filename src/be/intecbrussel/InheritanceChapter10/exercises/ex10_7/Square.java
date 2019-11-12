package be.intecbrussel.InheritanceChapter10.exercises.ex10_7;

public class Square extends Rectangle{
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
        this.setHeight(side);
        this.setWidth(side);
        this.setX(x);
        this.setY(y);
        squareCount++;
    }


    //creating a new square with an existing square
    Square(Square s) {
        this.setHeight(s.getSide());
        this.setWidth(s.getWidth());
        this.setX(s.getX());
        this.setY(s.getY());
        squareCount++;;
    }



    public int getSide() {
        return getHeight();
    }

    public void setSide(int side) {
        super.setHeight(side);
    }
    public void setHeight(int height) {
        this.setSide(height);
    }
    public void setWidth(int width) {
        this.setSide(width);
    }

    public static int getSquareCount() {
        return squareCount;
    }
}

