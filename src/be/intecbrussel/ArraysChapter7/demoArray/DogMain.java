package be.intecbrussel.ArraysChapter7.demoArray;

public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name ="Bart";


        Dog[] mydogs = new Dog[3];
        mydogs[0] = new Dog();
        mydogs[1] = new Dog();
        mydogs[2] = dog1;


    }


}

