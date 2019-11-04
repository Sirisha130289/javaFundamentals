package be.intecbrussel.defining_classesChapter8.demo;

public class Person {

    //defining the instance variables

    private String name;
    private int age;
    private double height;


    public void setName(String inputName) {
        name = inputName;
    }
    public String getName(){
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
