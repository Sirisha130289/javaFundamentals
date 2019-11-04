package be.intecbrussel.AssociatiesChapter9.exercises;

import org.w3c.dom.css.Rect;

public class Logo {

    private Rectangle[] r;
    private Circle[] c;

    private String text;
    private double area;

    public Rectangle[] getR() {
        return r;
    }

    public void setR(Rectangle[] r) {
        this.r = r;
    }

    public Circle[] getC() {
        return c;
    }

    public void setC(Circle[] c) {
        this.c = c;
    }


    Logo(Rectangle[] rectArray, Circle[] circArray, String text) {
        this.r = rectArray;
        this.c = circArray;
        this.text = text;
    }

    public double getArea() {
        double totalArea = 0;

        for (int i = 0; i < r.length; i++) {
            System.out.println("Rectangle on index " + i + " his area is " + r[i].getArea());
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("Circle on index " + i + " his area is " + c[i].getArea());
        }

        for (Rectangle rect : r
        ) {
            totalArea += rect.getArea();

        }

        for (Circle circ : c
        ) {
            totalArea += circ.getArea();

        }
        return totalArea;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}