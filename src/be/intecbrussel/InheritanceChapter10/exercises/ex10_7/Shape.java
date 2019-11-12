package be.intecbrussel.InheritanceChapter10.exercises.ex10_7;

public abstract class Shape {
    private static int shapeCount;
    private int x;
    private int y;

    Shape() {
        shapeCount++;
    }

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
        shapeCount++;
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

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public int getShapeCount() {
        return shapeCount;
    }
}
