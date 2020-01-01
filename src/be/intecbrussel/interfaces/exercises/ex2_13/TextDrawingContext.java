package be.intecbrussel.interfaces.exercises.ex2_13;


public class TextDrawingContext implements DrawingContext {

    @Override
    public void draw(Rectangle rectangle) {
        System.out.println("This is a rectangle");
    }

    @Override
    public void draw(Circle circle) {
        System.out.println("This is a circle");
    }

    @Override
    public void draw(Triangle triangle) {
        System.out.println("This is a triangle");
    }
}
