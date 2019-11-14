package be.intecbrussel.InheritanceChapter10.exercises.ex10_7;



public class Main {
    public static void main(String[] args) {

        System.out.println("Total no of Shapes: "+Rectangle.getRectangleCount()+Square.getSquareCount()+Circle.getCircleCount()+ Triangle.getTriangleCount()+ IsoScelesTriangle.getIsoTriangleCount() );
//        System.out.println("Rectangles - " +Rectangle.getRectangleCount());
//        System.out.println("Squares - " + Square.getSquareCount());
//        System.out.println("Circles - " +Circle.getCircleCount());
//        System.out.println("Triangles - "+ Triangle.getTriangleCount());
//        System.out.println("IsoScelesTriangles - "+ IsoScelesTriangle.getIsoTriangleCount());

        Rectangle rect1 = new Rectangle();

        Rectangle rect2 = new Rectangle(4, 5);

        Rectangle rect3 = new Rectangle(5, 6, 2, 3);

        Rectangle copyRect = new Rectangle(rect3);


        System.out.println("Total no of rectangles : " + Rectangle.getRectangleCount());

        Square square1 = new Square();

        Square square2 = new Square(3);

        Square square3 = new Square(4, 6, 5);

        Square copySquare = new Square(square3);


        System.out.println("Total no of squares : " + Square.getSquareCount());


        Circle circle1 = new Circle();

        Circle circle2 = new Circle(4);

        Circle circle3 = new Circle(3, 2, 3);

        Circle copyCircle = new Circle(circle3);


        System.out.println("Total no of circles : " + Circle.getCircleCount());

        Triangle triangle1 = new Triangle();

        Triangle triangle2 = new Triangle(5, 6, 7);

        Triangle triangle3 = new Triangle(4, 5, 6, 2, 3);

        Triangle copyTriangle = new Triangle(triangle3);


        System.out.println("Total no of triangles : " + Triangle.getTriangleCount());

        IsoScelesTriangle isoScelesTriangle1 = new IsoScelesTriangle();

        IsoScelesTriangle isoScelesTriangle2 = new IsoScelesTriangle(3, 4);

        IsoScelesTriangle isoScelesTriangle3 = new IsoScelesTriangle(3, 5, 4, 6);

        IsoScelesTriangle copyIsoScelesTriangle = new IsoScelesTriangle(isoScelesTriangle3);

        System.out.println("Total no of IsoScelesTriangles : " + IsoScelesTriangle.getIsoTriangleCount());

    }

}
