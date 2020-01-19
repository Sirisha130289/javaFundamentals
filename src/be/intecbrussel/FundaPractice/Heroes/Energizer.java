package be.intecbrussel.FundaPractice.Heroes;

public class Energizer extends Hero {
    public Energizer() {
    }

    public Energizer(String alias) {
        this.alias = alias;
    }

    public Energizer(String alias, int age) {
        this.alias = alias;
        this.age = age;
    }
    public void userSuperPower(){

    }

    @Override
    public String toString() {
        return "Energizer{" +
                "alias='" + alias + '\'' +
                ", age=" + age +
                '}';
    }
}
