package be.intecbrussel.inheritancePracticeExercises.hero;

import java.util.Arrays;

public class AllTheHeroes {
    Hero[] heroes = new Hero[4];

    public void addSuperHero(Hero hero) {
        if (isHeroAlreadyPresent(hero)) {
            System.out.println("Hero "+ hero+" already in");
        } else {
            boolean heroAdded = false;
            for (int i = 0; i < heroes.length; i++) {
                if ((heroes[i] == null)) {
                    heroAdded = true;
                    heroes[i] = hero;
                    System.out.println(heroes[i]);
                    break;
                }
            }

            if (!heroAdded) {
                System.out.println("No more spaces for heros to be added!");
            }
        }
    }






    public void removeSuperHero(Hero hero) {
        boolean heroRemoved = false;
        for (int i = 0; i < heroes.length; i++) {
            if (hero instanceof ArmedHero && heroes[i] instanceof ArmedHero) {
                heroes[i] = null;
                heroRemoved = true;
                System.out.println("Hero : " + hero + " removed");
            } else if (hero instanceof Tank && heroes[i] instanceof Tank) {
                heroes[i] = null;
                heroRemoved = true;
                System.out.println("Hero : " + hero + " removed");
            } else if (hero instanceof ShapeShifter && heroes[i] instanceof ShapeShifter) {
                heroes[i] = null;
                heroRemoved = true;
                System.out.println("Hero : " + hero + " removed");
            } else if (hero instanceof Energizer && heroes[i] instanceof Energizer) {
                heroes[i] = null;
                heroRemoved = true;
                System.out.println("Hero : " + hero + " removed");
            }
        }

        if (!heroRemoved) {
            System.out.println("Hero doesnt exist to delete");
        }
    }




    private boolean isHeroAlreadyPresent(Hero hero) {
        for (int i = 0; i < heroes.length; i++) {
            if (hero instanceof ArmedHero && heroes[i] instanceof ArmedHero) {
                return true;
            } else if (hero instanceof Tank && heroes[i] instanceof Tank) {
                return true;
            } else if (hero instanceof ShapeShifter && heroes[i] instanceof ShapeShifter) {
                return true;
            } else if (hero instanceof Energizer && heroes[i] instanceof Energizer) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "AllTheHeroes{" +
                "heroes=" + Arrays.toString(heroes) +
                '}';
    }
}