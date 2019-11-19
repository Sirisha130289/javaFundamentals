package be.intecbrussel.inheritancePracticeExercises.hero;

public class AllTheHeroes {
    Hero[] heroes = new Hero[4];

    AllTheHeroes() {

    }

    public void addSuperHero(Hero hero) {
        for (Hero hero1 : heroes) {
            System.out.println(hero1);
        }

        for (Hero hero2 : heroes) {
            System.out.println(hero2);
        }
    }

    public void removeSuperHero(Hero hero) {
        for (Hero hero3 : heroes) {
            System.out.println(hero3);
        }

        for (Hero hero4: heroes) {
            System.out.println(hero4);
        }
    }

    public boolean isHero(Hero hero) {
        return true;
    }
}
