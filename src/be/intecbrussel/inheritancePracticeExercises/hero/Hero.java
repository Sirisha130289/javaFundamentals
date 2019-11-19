package be.intecbrussel.inheritancePracticeExercises.hero;

public class Hero {
    public String alias;
    private int age;
    private Team team;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void useSuperPower() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
