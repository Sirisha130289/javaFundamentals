package be.intecbrussel.InheritanceChapter10.exercises.ex10_7_animals;

public class Snake extends Animal {

    Snake() {

    }

    Snake(String name) {
        super.setName("Kala");
    }


    public String move() {
        return "Snake is moving";
    }

    public String makeNoise() {
        return "hiss hiss";
    }
}
