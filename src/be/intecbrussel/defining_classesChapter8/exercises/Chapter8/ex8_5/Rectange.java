package be.intecbrussel.defining_classesChapter8.exercises.Chapter8.ex8_5;

public class Rectange {

    private double height;
    private double width;
    private int x;
    private int y;
    public void grow(int d){
        height = (d*height/100)+height;
        width = (d*width/100)+width;

    };

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
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


    public double getArea() {
        return height * width;
    }


    public double getPerimeter() {
        return 2 * (height + width);
    }

}
