package be.intecbrussel.InheritanceChapter10.exercises.ex10_4;

public class Rectangle  {

    private int height;
    private int width;
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

    public static void main(String[] args) {



        Square square = new Square();
        square.setSide(5);

        System.out.println("The dimensions of the square are: "+ square.getSide()+"*"+square.getSide());
        System.out.println("The height of the square are: "+ square.getHeight());
        System.out.println("The width of the square are: "+square.getWidth());
    }


}
