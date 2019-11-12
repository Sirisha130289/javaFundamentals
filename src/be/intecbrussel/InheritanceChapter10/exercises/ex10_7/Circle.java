package be.intecbrussel.InheritanceChapter10.exercises.ex10_7;

public class Circle extends Shape {
    public static final int ANGLES = 0;
    private static int circleCount;
    private int radius;

    public static int getCircleCount() {
        return circleCount;
    }

    Circle() {
        circleCount++;
    }

    Circle(int radius) {
        this.radius = radius;
        circleCount++;
    }

    Circle(int radius, int x, int y) {
        this.radius = radius;
        this.setX(x);
        this.setY(y);
        circleCount++;
    }

    Circle(Circle c) {
        this.radius = radius;
        this.setX(getX());
        this.setY(getY());
        circleCount++;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


}
