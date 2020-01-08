package be.intecbrussel.Test06012020.Teacher;

import java.util.Random;

public class ChaitanyaStudent implements Student {

    private Random random = new Random();
    private int marks = 0;

    ChaitanyaStudent() {
        marks = random.nextInt(99);
    }

    @Override
    public String toString() {
        return "ChaitanyaStudent{" +
                "random=" + random +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int getMarks() {
        return marks;
    }

    @Override
    public String getCollegeName() {
        return "I am Chaitanya Student";
    }
}
