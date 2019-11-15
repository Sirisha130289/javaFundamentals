package be.intecbrussel.InheritanceChapter10.exercises.ex10_7_animals;

public class Cat extends Animal{

    Cat(){

    }
    Cat (String name){
        super.setName("Tom");
    }
    @Override
    public String move() {
        return "Cat is moving";
    }

    @Override
    public String makeNoise() {
        return "meow meow";
    }


}
