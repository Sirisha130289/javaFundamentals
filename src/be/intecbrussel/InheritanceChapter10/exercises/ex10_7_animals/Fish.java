package be.intecbrussel.InheritanceChapter10.exercises.ex10_7_animals;

public class Fish extends Animal {
    Fish() {

    }

    Fish(String name) {
        super.setName("Nemo");
    }
    public String move() {
        return "Fish is moving";
    }
    public String makeNoise() {
        return "hums hums";
    }

}
