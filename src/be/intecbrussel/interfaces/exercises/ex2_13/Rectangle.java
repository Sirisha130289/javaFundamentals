package be.intecbrussel.interfaces.exercises.ex2_13;

public class Rectangle extends Shape {

    private int height;
    private int width;
    private double area;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }

    @Override
    public void scale(int factor) {
        this.height = height * factor / 100;
        this.width = width * factor / 100;

    }
}
