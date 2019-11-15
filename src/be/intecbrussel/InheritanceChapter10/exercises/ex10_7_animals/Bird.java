package be.intecbrussel.InheritanceChapter10.exercises.ex10_7_animals;

public class Bird extends Animal {
    Bird() {

    }

    Bird(String name) {
        super.setName("Rio");
    }


    public String move() {
        return "Bird is moving";
    }

    public String makeNoise() {
        return "koo koo";
    }
}
