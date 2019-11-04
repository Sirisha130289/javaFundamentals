package be.intecbrussel.AssociatiesChapter9.exercises;

import org.w3c.dom.css.Rect;

public class Logo {

    private Rectangle r;
    private Circle c;
    private Text t;


    private double area;

    Logo(Rectangle r, Circle c, Text t) {
        this.r = r;
        this.c = c;
        this.t=t;
    }

    public double getArea() {
   return r.getArea()+c.getArea();

    }
    public void setR(Rectangle r) {
        this.r = r;
    }
    public void getR() {
        this.r = r;
    }
    public void setC(Circle c) {
        this.c = c;
    }

    public void getC() {
        this.c = c;
    }


    public void setT(Text t) {
        this.t = t;
    }
    public Text getT() {
        return t;
    }

}


