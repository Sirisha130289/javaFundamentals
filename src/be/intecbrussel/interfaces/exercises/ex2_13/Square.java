package be.intecbrussel.interfaces.exercises.ex2_13;

public class Square extends Rectangle {
    private int side;

    public int getSide() {
        return getHeight();
    }

    public void setSide(int side) {
        setHeight(side);
        setWidth(side);
    }


}
