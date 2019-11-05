package be.intecbrussel.InheritanceChapter10.exercises.ex10_3;

public class Square extends Rectangle {
    private int side;

    public void setSide(int side){
        this.side= side<0?-side:side;
    }

    public int getSide() {
        return side;
    }
}
