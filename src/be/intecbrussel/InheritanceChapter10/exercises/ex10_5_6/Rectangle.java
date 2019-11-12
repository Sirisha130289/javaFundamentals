package be.intecbrussel.InheritanceChapter10.exercises.ex10_5_6;

public class Rectangle {

    public static int count; //only if it is static, it can be shared across objects.
    public static final int ANGLES = 4;
    private int height;
    private int width;

    Rectangle() {
        count++;
    }

    public static void main(String[] args) {
        Square noArgumentSquare = new Square();
        noArgumentSquare.setSide(4);
        System.out.println(noArgumentSquare);

        Square sideArgumentSquare = new Square(5);
        System.out.println(sideArgumentSquare);

        Square sideAndPositionSquare = new Square(5, 2, 3);
        System.out.println(sideAndPositionSquare);

        Square copySquare = new Square(sideAndPositionSquare);
        System.out.println(copySquare);

        System.out.println(Square.getSquareCount());
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(6);
        System.out.println(rectangle);


    }


    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "count=" + count +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public void setWidth(int width) {
        this.width = width;
    }


}
