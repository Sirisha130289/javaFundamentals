package be.intecbrussel.collections.demo;

public class Box implements Comparable<Box> {
    private int length;
    private int width;
    private int height;


    public Box() {
        this(0, 0, 0);
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume() {
        return height * width * length;
    }

    @Override
    public int compareTo(Box obj) {
        return this.getVolume() - obj.getVolume();
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
