package be.intecbrussel.InheritanceChapter10.exercises.ex10_7_animals;

public abstract class Animal {
    private String name;

    Animal() {

    }

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String move();

    public abstract String makeNoise();
}
