package be.intecbrussel.inheritancePracticeExercises.hero;

import be.intecbrussel.InheritanceChapter10.exercises.ex10_7.Shape;

public class ShapeShifter extends Hero{
    ShapeShifter(){

    }
    ShapeShifter(String name){
        this.alias = name;
    }
    ShapeShifter(String name, int age){
        this.alias = name;
        super.setAge(age);
    }
@Override
    public void useSuperPower(){
        super.useSuperPower();
        System.out.println("Jet Away!");

    }

    @Override
    public String toString() {
        return "ShapeShifter{" +
                "alias='" + alias + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
