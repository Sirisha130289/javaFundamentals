package be.intecbrussel.InheritanceChapter10.exercises.ex10_7_animals;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        Fish fish = new Fish("Nemo");
        Bird bird = new Bird("Rio");
        Snake snake = new Snake("Kala");

        System.out.println(cat.move());
        System.out.println(cat.makeNoise());
        System.out.println();
        System.out.println(fish.move());
        System.out.println(fish.makeNoise());
        System.out.println();
        System.out.println(bird.move());
        System.out.println(bird.makeNoise());
        System.out.println();
        System.out.println(snake.move());
        System.out.println(snake.makeNoise());
    }
}
