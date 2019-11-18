package be.intecbrussel.inheritancePracticeExercises.hero;

public class Energizer extends Hero{

    Energizer(){

    }
    Energizer(String name){
        this.alias =name;
    }

    Energizer(String name, int age){
        this.alias= name;
        this.age = age;
    }

    public void useSuperPower(){

    }

    @Override
    public String toString() {
        return "Energizer{" +
                "alias='" + alias + '\'' +
                ", age=" + age +
                '}';
    }
}
