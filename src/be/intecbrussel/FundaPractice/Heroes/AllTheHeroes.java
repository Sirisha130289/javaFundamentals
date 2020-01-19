package be.intecbrussel.FundaPractice.Heroes;

public class AllTheHeroes {
    Hero[] heroes = new Hero[4];

    public AllTheHeroes(Hero[] heroes) {
        this.heroes = heroes;
    }

    public void addSuperHeroes(Hero hero) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] == null) {
                heroes[i] = hero;
            }
        }
    }

    public void RemoveSuperHeroes(Hero hero) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] instanceof ArmedHero && hero instanceof ArmedHero) {
                heroes[i] = null;
                break;
            } else if (heroes[i] instanceof Energizer && hero instanceof Energizer) {
                heroes[i] = null;
                break;
            } else if (heroes[i] instanceof Tank && hero instanceof Tank) {
                heroes[i] = null;
                break;
            } else if (heroes[i] instanceof ShapeShifter && hero instanceof ShapeShifter) {
                heroes[i] = null;
                break;
            }
        }
    }

    public boolean isHero(Hero hero) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] instanceof ArmedHero && hero instanceof ArmedHero) {
                return true;
            } else if (heroes[i] instanceof Energizer && hero instanceof Energizer) {
                return true;
            } else if (heroes[i] instanceof Tank && hero instanceof Tank) {
                return true;
            } else if (heroes[i] instanceof ShapeShifter && hero instanceof ShapeShifter) {
                return true;
            }
        }
        return false;
    }
}

