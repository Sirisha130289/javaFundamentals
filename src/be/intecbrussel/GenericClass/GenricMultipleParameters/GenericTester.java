package be.intecbrussel.GenericClass.GenricMultipleParameters;



public class GenericTester {
    public static void main(String[] args) {
        Box<Integer, String> box = new Box<Integer, String>();
        box.add(10, "Hello World");
        System.out.println(box.getT());
        System.out.println(box.getS());


        Box<String , String> stringBox = new Box<String,String>();
        stringBox.add("Hi","How are you");
        System.out.println(stringBox.getT());
        System.out.println(stringBox.getS());
    }

}
