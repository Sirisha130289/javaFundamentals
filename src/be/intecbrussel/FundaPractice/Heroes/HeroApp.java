package be.intecbrussel.FundaPractice.Heroes;

public class HeroApp {
    public static void main(String[] args) {

        Hero[] deJusticeLeague = new Hero[4];

        Hero[] deAvengers = new Hero[4];


    }

    Hero[] heroes = new Hero[4];

    public void print(Hero[] hero) {

        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }
    }

    public void printHeader() {
        System.out.println();
    }

    public boolean FancyLines() {
        return true;
    }
}

