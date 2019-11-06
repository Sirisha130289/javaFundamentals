package be.intecbrussel.InheritanceChapter10.exercises.ex10_3;

public class Square extends Rectangle {
    private int side;

    public void setSide(int side) {
        side = side < 0 ? -side : side;
        setHeight(side);
        setWidth(side);


    }

    public int getSide() {
        return getHeight();
    }

    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(-5);
        System.out.println("Dimensions are : " + square.getSide() + "*" + square.getSide());
    }
}


