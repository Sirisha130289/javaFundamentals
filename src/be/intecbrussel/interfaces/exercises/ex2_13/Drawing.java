package be.intecbrussel.interfaces.exercises.ex2_13;

public class Drawing implements Drawable {

    private int size;
    private Drawable drawables;

    Drawing() {

    }

    public void add(Drawable s) {
        this.drawables = s;
    }

    public void remove(Drawable s) {

    }

    public void clear() {

    }

    public int getSize() {
        return size;
    }

    public Drawable getDrawables() {
        return drawables;
    }

    public void setDrawables(Drawable drawables) {
        this.drawables = drawables;
    }

    @Override
    public void draw(DrawingContext dc) {

    }

    @Override
    public void scale(int s) {

    }

    @Override
    public void scaleDouble() {

    }

    @Override
    public void scaleHalf() {

    }

    @Override
    public String toString() {
        return "Drawing{" +
                "size=" + size +
                '}';
    }
}
