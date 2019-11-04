package be.intecbrussel.AssociatiesChapter9.exercises;

import org.w3c.dom.css.Rect;

public class Logo {

    private Rectangle[] r;
    private Circle[] c;
    private Text t;
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



    Logo(Rectangle[] rectArray, Circle[] circArray, Text t) {
        this.r = rectArray;
        this.c = circArray;
        this.t=t;
    }

    public double getArea() {
        double totalArea = 0;

        for(int i = 0 ; i < r.length; i++){
            System.out.println("Rectangle on index " + i + " his area is " +r[i].getArea());
        }
        for(int i = 0 ; i < c.length; i++){
            System.out.println("Circle on index " + i + " his area is " +c[i].getArea());
        }

        for (Rectangle rect: r
             ) {
            totalArea += rect.getArea();

        }

        for (Circle circ: c
             ) {
            totalArea += circ.getArea();

        }
        return totalArea;

    }


    public void setT(Text t) {
        this.t = t;
    }
    public Text getT() {
        return t;
    }

}


