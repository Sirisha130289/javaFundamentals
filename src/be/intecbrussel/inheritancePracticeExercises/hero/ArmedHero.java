package be.intecbrussel.inheritancePracticeExercises.hero;

public class ArmedHero extends Hero{
    ArmedHero(){

    }



    ArmedHero(String name){
        this.alias = name;
    }

    ArmedHero(String name, int age){
        this.alias = name;
        this.age = age;
    }

    public void useSuperPower(){

    }

    @Override
    public String toString() {
        return "ArmedHero{" +
                "alias='" + alias + '\'' +
                ", age=" + age +
                '}';
    }
}
