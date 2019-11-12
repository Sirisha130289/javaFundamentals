package be.intecbrussel.InheritanceChapter10.exercises.ex10_7;

public class Triangle extends Shape {
    public static final int ANGLES =3;
    private static int triangleCount;
    private int height;
    private int width;
    private int perpendicular;


    public static int getTriangleCount() {
        return triangleCount;
    }

    Triangle(){
        triangleCount++;
    }
    Triangle(int w, int h, int p){
        this.width =w;
        this.height=h;
        this.perpendicular =p;
        triangleCount++;
    }
    Triangle(int w, int h, int p, int x, int y){
        this.width =w;
        this.height=h;
        this.perpendicular =p;
        this.setX(x);
        this.setY(y);
        triangleCount++;
    }

    Triangle(Triangle t){
        this.width =t.width;
        this.height =t.height;
        this.perpendicular = t.perpendicular;
        this.setX(getX());
        this.setY(getY());
        triangleCount++;
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

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }
    public double getArea() {
        return (1/2)*width*height;
    }
    public double getPerimeter() {
        return width+height+perpendicular;
    }
}
