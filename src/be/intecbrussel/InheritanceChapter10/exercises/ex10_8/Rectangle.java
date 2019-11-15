package be.intecbrussel.InheritanceChapter10.exercises.ex10_8;

public class Rectangle extends Shape {
    private static int rectangleCount; //only if it is static, it can be shared across objects.
    public static final int ANGLES = 4;
    private int height;
    private int width;

    Rectangle() {
        rectangleCount++;
    }

    public static int getRectangleCount() {
        return rectangleCount;
    }

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        rectangleCount++;
    }

    Rectangle(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.setX(x);
        this.setY(y);
        rectangleCount++;
    }

    Rectangle(Rectangle r) {
        this.height = r.height;
        this.width = r.width;
        this.setX(r.getX());
        this.setY(r.getY());
        rectangleCount++;
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
    public double getArea()
    {
        return height*width;
    }
    public double getPerimeter() {
        return 2*(height+width);
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "count=" + rectangleCount +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
