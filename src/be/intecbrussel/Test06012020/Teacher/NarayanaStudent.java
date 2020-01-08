package be.intecbrussel.Test06012020.Teacher;

import java.util.Random;

public class NarayanaStudent implements Student {

    private Random random = new Random();
    private int marks = 0;

    NarayanaStudent() {
        marks = random.nextInt(99);
    }

    @Override
    public String toString() {
        return "NarayanaStudent{" +
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
        return "I am Narayana Student";
    }
}
