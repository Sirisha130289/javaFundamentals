package be.intecbrussel.AssociatiesChapter9.exercises;

public class Circle {
    private int radius;
    private double area;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }
}
