package be.intecbrussel.two_Generics;

public class TwoGenericsApp {
    public static void main(String[] args) {
        TwoGenerics<Integer, String> twoGenerics = new TwoGenerics<>(88, "Generics");
        twoGenerics.showTypes();
        System.out.println(twoGenerics.getObject1());
        System.out.println(twoGenerics.getObject2());
    }
}
