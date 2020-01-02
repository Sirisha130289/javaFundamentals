package be.intecbrussel.interfaces.exercises.ex2_13;

public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }

    @Override
    public void scale(int factor) {
        this.radius = radius * factor / 100;


    }
}



