package be.intecbrussel.AssociatiesChapter9.exercises;

public class MainLogoApp {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Text t = new Text();
        Logo l = new Logo(r, c, t);


        r.setHeight(5);
        r.setWidth(6);
        c.setRadius(6);

        System.out.println("The total area of logo:" + Math.round(l.getArea()));
    }
}
