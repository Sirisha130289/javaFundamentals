package be.intecbrussel.FundaPractice.Heroes;

public class Hero {
    public String alias;
    public int age;

    public void userSuperHero(Hero hero) {

    }

    @Override
    public String toString() {
        return "Hero{" +
                "alias='" + alias + '\'' +
                ", age=" + age +
                '}';
    }
}
