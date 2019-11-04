package be.intecbrussel.defining_classesChapter8.exercises.Chapter8.ex8_7;

public class ConstructorsApp {
    public static void main(String[] args) {
        Constructors rect1 = new Constructors(5, 4);
        Constructors rect2 = new Constructors(2, 3, 1, 2);


        System.out.println("Height of Rectangle 1:" + rect1.getHeight());
        System.out.println("Width of Rectangle 1:" + rect1.getWidth());
        System.out.println("Area of Rectangle 1:" + rect1.getArea());
        System.out.println("Parameter of Rectangle 1: " + rect1.getParameter());

        System.out.println("Height of Rectangle 2:" + rect2.getWidth());
        System.out.println("Width of Rectangle 2:" + rect2.getHeight());
        System.out.println("Area of Rectangle 2:" + rect2.getArea());
        System.out.println("Parameter of Rectangle 2: " + rect2.getParameter());


    }
}
