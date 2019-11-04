package be.intecbrussel.AssociatiesChapter9.exercises;

public class Rectangle {
    private int height;
    private int width;
    private double area;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

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

    public  double getArea() {
        return height*width;
    }
}
