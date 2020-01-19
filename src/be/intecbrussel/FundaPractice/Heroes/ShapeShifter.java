package be.intecbrussel.FundaPractice.Heroes;

public class ShapeShifter extends Hero {
    public ShapeShifter() {
    }

    public ShapeShifter(String alias) {
        this.alias = alias;
    }

    public ShapeShifter(String alias, int age) {
        this.alias = alias;
        this.age = age;
    }

    public void useSuperPower(){

    }

    @Override
    public String toString() {
        return "ShapeShifter{" +
                "alias='" + alias + '\'' +
                ", age=" + age +
                '}';
    }
}
