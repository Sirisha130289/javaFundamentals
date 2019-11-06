package be.intecbrussel.InheritanceChapter10.exercises.ex10_4;


public class Square extends Rectangle {
    private int side;


    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    public int getSide() {
        return getHeight();

    }

    @Override //annotation
    public void setHeight(int height) {
        setSide(height);                        //replacing the methods in the square class
    }

    @Override //annotation
    public void setWidth(int width) {
        setSide(width);                         //replacing the methods in the square class
    }

    public static void main(String[] args) {


        Square square = new Square();
        square.setSide(5);
        square.setHeight(6);
        square.setWidth(7);

        System.out.println("The dimensions of the square are: " + square.getSide() + "*" + square.getSide());
        System.out.println("The height of the square are: " + square.getHeight());
        System.out.println("The width of the square are: " + square.getWidth());
    }

}