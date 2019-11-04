package be.intecbrussel.defining_classesChapter8.exercises.Chapter8.ex8_8;

public class Rectangle {
    public static int angles =4;
private int height;
private int width;
private int x;
private int y;
    public Rectangle (){
        this(5,4,2,3);

    }
    public Rectangle(int width, int height,int x,int y){
        setWidth(width);
        setHeight(height);
        setX(x);
        setY(y);

    }

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
}
