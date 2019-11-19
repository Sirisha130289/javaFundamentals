package be.intecbrussel.inheritancePracticeExercises.hero;

public class Energizer extends Hero{

    Energizer(){

    }
    Energizer(String name){
        this.alias =name;
    }

    Energizer(String name, int age){
        this.alias= name;
        super.setAge(age);
    }

    public void useSuperPower(){
        System.out.println("Thunder Punch");

    }

    @Override
    public String toString() {
        return "Energizer{" +
                "alias='" + alias + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
