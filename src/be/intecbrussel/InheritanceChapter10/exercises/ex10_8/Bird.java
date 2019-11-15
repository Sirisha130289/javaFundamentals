package be.intecbrussel.InheritanceChapter10.exercises.ex10_8;

public class Bird extends Animal {
    Bird() {

    }

    Bird(String name) {
        super.setName("Bird");
    }


    public String move() {
        return "Bird is moving";
    }

    public String makeNoise() {
        return "koo koo";
    }
}
