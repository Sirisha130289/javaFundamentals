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


    public void setHeight(int height) {
        setSide(height);                        //replacing the methods in the square class
    }


    public void setWidth(int width) {
        setSide(width);                         //replacing the methods in the square class
    }
}