package be.intecbrussel.inheritancePracticeExercises.hero;

public class Tank extends Hero {
    Tank() {

    }

    private Hero hero;

    Tank(String name) {
        this.alias = name;
    }

    Tank(String name, int age) {
        this.alias = name;
        super.setAge(age);
    }

    public void useSuperPower() {
        System.out.println("Stompy Boy");

    }

    @Override
    public String toString() {
        return "Tank{" +
                "alias='" + alias + '\'' +
                ", age=" + super.getAge() +
                '}';
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
