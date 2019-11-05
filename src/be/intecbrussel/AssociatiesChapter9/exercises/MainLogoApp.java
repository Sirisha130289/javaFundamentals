package be.intecbrussel.AssociatiesChapter9.exercises;

import org.w3c.dom.css.Rect;

public class MainLogoApp {
    public static void main(String[] args) {
        Rectangle myRect1 = new Rectangle(100,50);
        Rectangle myRect2 = new Rectangle(20,200);
        Rectangle myRect3 = new Rectangle(5,10);
        Circle myCirc1 = new Circle();
        Circle myCirc2 = new Circle();
        Circle myCirc3 = new Circle();


        Rectangle[] rectangleArray = {myRect1, myRect2, myRect3};
        Circle[] circleArray = {myCirc1, myCirc2, myCirc3};

        String text = "Pepsi";
        Logo l = new Logo(rectangleArray, circleArray, text);

        System.out.println(l.getArea()) ;



    }
}
