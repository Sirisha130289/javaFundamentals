package be.intecbrussel.FundaPractice.Heroes;

public class ArmedHero extends Hero {
    public ArmedHero() {
    }

    public ArmedHero(String alias) {
        this.alias = alias;
    }

    public ArmedHero(String alias, int age) {
        this.alias = alias;
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
