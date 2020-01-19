package be.intecbrussel.FundaPractice.Heroes;

public class Tank extends Hero {
    public Tank() {
    }

    public Tank(String alias) {
        this.alias = alias;
    }

    public Tank(String alias, int age) {
        this.alias = alias;
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
