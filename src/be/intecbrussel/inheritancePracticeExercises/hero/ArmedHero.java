package be.intecbrussel.inheritancePracticeExercises.hero;

public class ArmedHero extends Hero{


    ArmedHero(){

    }

    ArmedHero(String name){
        this.alias = name;
    }

    ArmedHero(String name, int age){
        this.alias = name;
        super.setAge(age);
    }


    public void useSuperPower(){
        System.out.println("Make Marvel Great again.");

    }

    @Override
    public String toString() {
        return "ArmedHero{" +
                "alias='" + alias + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
