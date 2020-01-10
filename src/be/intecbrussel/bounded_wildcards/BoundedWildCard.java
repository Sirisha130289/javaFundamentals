package be.intecbrussel.bounded_wildcards;

public class BoundedWildCard {


    public static void showXY(Coordinates<?> c) {
        System.out.println("The X and Y values are: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].getX() + " " + c.coords[i].getY());
            System.out.println();
        }
        System.out.println();

    }

    public static void showXYZ(Coordinates<? extends ThreeD> c) {
        System.out.println("The X ,Y and Z values are: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].getX() + " " + c.coords[i].getY() + " " + c.coords[i].getZ());
            System.out.println();
        }

        System.out.println();

    }

    public static void showXYZT(Coordinates<? extends FourD> c) {
        System.out.println("The X ,Y ,Z and T values are: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].getX() + " " + c.coords[i].getY() + " " + c.coords[i].getZ() + +c.coords[i].getT());
            System.out.println();
        }
        System.out.println();
    }
}