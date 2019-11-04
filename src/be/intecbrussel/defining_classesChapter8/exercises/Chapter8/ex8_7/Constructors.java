package be.intecbrussel.defining_classesChapter8.exercises.Chapter8.ex8_7;

public class Constructors {
    private int height;
    private int width;
    private int x;
    private int y;
    private double area;
    private double parameter;

    public Constructors(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Constructors() {
    }

    public Constructors(int width, int height, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    ;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height<0?-height:height;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width<0?-width:width;
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

    public double getArea() {
        return height*width;
    }

    public double getParameter() {
        return 2*(height+width);
    }
}
