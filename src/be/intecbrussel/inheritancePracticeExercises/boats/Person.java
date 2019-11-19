package be.intecbrussel.inheritancePracticeExercises.boats;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Captain " +
                 name + '\'' +
                ", Age = " + age ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
