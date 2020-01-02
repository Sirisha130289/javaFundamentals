package be.intecbrussel.interfaces.exercises.ex2_13;

import org.w3c.dom.Text;

public class DrawingApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(4);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(4);
        rectangle1.setHeight(6);

        Square square = new Square();
        square.setSide(5);

        Circle circle = new Circle();
        circle.setRadius(7);


        Drawing drawing = new Drawing();

        drawing.add(rectangle);
        drawing.add(rectangle1);
        drawing.add(square);
        drawing.add(circle);

        System.out.println(drawing.getSize());
        TextDrawingContext tdc = new TextDrawingContext();
        drawing.draw(tdc);

        drawing.remove(rectangle1);

        System.out.println(drawing.getSize());


    }

}
