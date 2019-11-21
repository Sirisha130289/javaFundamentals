package be.intecbrussel.inheritancePracticeExercises.hero;

import be.intecbrussel.InheritanceChapter10.exercises.ex10_7.Shape;

public class AllTheHeroes {
    Hero[] heroes = new Hero[4];
    private int count = 0; // we will increment each time a new hero is added.

    AllTheHeroes() {

    }

    public void addSuperHero(Hero hero) {
        if (isHero(hero)) {
            System.out.println("all ready in");
        } else {
            for (int i = 0; i < heroes.length; i++) {
                if ((heroes[i] == null)) {
                    heroes[i] = hero;

                    System.out.println(heroes[i]);
                } else {
                    System.out.println("No more heroes can be added");
                }
            }
        }



    }

    public void removeSuperHero(Hero hero) {


        for (int i = 0; i < heroes.length; i++) {
            if ((heroes[i] == null) && (isHero(hero))) {
                heroes[i] = hero;
            }

        }
    }

    public boolean isHero(Hero hero) {
        for (int i = 0; i < heroes.length; i++) {
            if (hero instanceof ArmedHero) {
                ArmedHero armedHero = (ArmedHero) hero;
                return true;
            } else if (hero instanceof Tank) {
                Tank tank = (Tank) hero;
                return true;
            } else if (hero instanceof ShapeShifter) {
                ShapeShifter shapeShifter = (ShapeShifter) hero;
                return true;
            } else if (hero instanceof Energizer) {
                Energizer energizer = (Energizer) hero;
                return true;
            }


        }
        return false;
    }
}