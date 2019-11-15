package be.intecbrussel.InheritanceChapter10.exercises.ex10_8;

public class Fish extends Animal {
    Fish() {

    }

    Fish(String name) {
        super.setName("Fish");
    }
    public String move() {
        return "Fish is moving";
    }
    public String makeNoise() {
        return "hums hums";
    }

}
