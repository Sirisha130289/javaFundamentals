package be.intecbrussel;

public class DuoApp {
    public static void main(String[] args) {
        Duo<Integer> duo = new Duo<Integer>(13, 23);
        System.out.println("Before Swapping");
        System.out.println(duo.getFirst());
        System.out.println(duo.getSecond());
        duo.swap();
        System.out.println("After Swapping");
        System.out.println(duo.getFirst());
        System.out.println(duo.getSecond());
        duo.swap();
        System.out.println("Swap it again");
        System.out.println(duo.getFirst());
        System.out.println(duo.getSecond());

        Duo<String> duo1 = new Duo<String>("Hello", "John");
        System.out.println("Before Swapping");
        System.out.println(duo1.getFirst());
        System.out.println(duo1.getSecond());
        duo.swap();
        System.out.println("After Swapping");
        System.out.println(duo1.getFirst());
        System.out.println(duo1.getSecond());
        duo.swap();
        System.out.println("Swap it again");
        System.out.println(duo1.getFirst());
        System.out.println(duo1.getSecond());

    }
}
