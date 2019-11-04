package be.intecbrussel.defining_classesChapter8.exercises.Chapter8.ex8_6;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setHeight(-5);
        rect.setBreadth(-6);
        rect.setX(4);
        rect.setY(3);
        rect.setPosition(4,3);

        System.out.println("Height of the rectangle: "+ rect.getHeight());
        System.out.println("Breadth of the rectangle : "+ rect.getBreadth());
        System.out.println("The area of the rectangle : " + rect.getArea());
        System.out.println("The perimeter of the rectangle : " + rect.getPerimeter());



    }
}
