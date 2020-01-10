package be.intecbrussel.two_Generics;

public class TwoGenerics<K, V> {

    K object1;
    V object2;

    public TwoGenerics(K object1, V object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public K getObject1() {
        return object1;
    }

    public V getObject2() {
        return object2;
    }

    public void showTypes() {
        System.out.println("The type of object1 is: " + object1.getClass().getSimpleName());
        System.out.println("The type of object2 is: " + object2.getClass().getSimpleName());
    }
    public void swap(){
        K temp=object1;


    }
}
