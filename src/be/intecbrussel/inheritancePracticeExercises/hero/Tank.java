package be.intecbrussel.inheritancePracticeExercises.hero;

public class Tank extends Hero{
    Tank(){

    }

    Tank(String name){
        this.alias = name;
    }
    Tank(String name, int age){
        this.alias = name;
        this.age = age;
    }

    public void useSuperPower(){

    }

    @Override
    public String toString() {
        return "Tank{" +
                "alias='" + alias + '\'' +
                ", age=" + age +
                '}';
    }
}
