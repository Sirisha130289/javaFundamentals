package be.intecbrussel.defining_classesChapter8.exercises.Chapter8.ex8_6;

public class Rectangle {

    private int height;
    private int breadth;
    private int x,y;
    private int position;
    private double area;
    private double perimeter;
    public void grow(int d){
        height = (d*height/100)+height;
        breadth = (d*breadth/100)+breadth;
    };
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height<0?-height:height;
    }
    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth= breadth<0?-breadth:breadth;
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

    public void setPosition(int xpos,int ypos) {
       x=xpos;
       y=ypos;
    }

    public double getPerimeter() {
        return 2 * (height + breadth);
    }

    public double getArea() {
        return height*breadth;
    }
}
