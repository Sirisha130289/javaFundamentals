package be.intecbrussel.defining_classesChapter8.exercises.Chapter8.ex8_5;

public class RectApp {
    public static void main(String[] args) {
        Rectange rect = new Rectange();

        rect.setHeight(1.5);
        rect.setWidth(3.5);
        rect.setX(5);
        rect.setY(4);
        rect.setPosition(5, 4);



        System.out.println("height of the rectangle: " + rect.getHeight());
        System.out.println("width of the rectangle: " + rect.getWidth());

        System.out.println("area of the rectangle:" +rect.getArea());
        System.out.println("perimeter of the rectangle: "+ rect.getPerimeter());
    }
}
