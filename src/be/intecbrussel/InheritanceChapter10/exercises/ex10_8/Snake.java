package be.intecbrussel.InheritanceChapter10.exercises.ex10_8;

public class Snake extends Animal {

    Snake() {

    }

    Snake(String name) {
        super.setName("Bird");
    }


    public String move() {
        return "Snake is moving";
    }

    public String makeNoise() {
        return "hiss hiss";
    }
}
