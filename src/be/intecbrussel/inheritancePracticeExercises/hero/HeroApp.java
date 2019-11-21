package be.intecbrussel.inheritancePracticeExercises.hero;

public class HeroApp {
    public static void main(String[] args) {
        Team team1 = new Team();
        Team team2 = new Team();

        team1.setTeamName("TheJusticeLeague");
        team2.setTeamName("TheAvengers");


        Hero[] heroes = new Hero[4];
        heroes[0] = new ArmedHero("Bruce", 45);
        heroes[1] = new Tank("Clark Kent", 5000);
        heroes[2] = new ShapeShifter("Barry Allen", 32);
        heroes[3] = new Energizer("Gibson Rickenbacker", 40);

        heroes[0].setTeam(team1);
        heroes[1].setTeam(team1);
        heroes[2].setTeam(team1);
        heroes[3].setTeam(team1);


        Hero[] moreHeroes = new Hero[4];
        moreHeroes[0] = new ArmedHero("Steve Rogers", 98);
        moreHeroes[1] = new Tank("Bruce Banner", 50);
        moreHeroes[2] = new ShapeShifter("Tony Stark", 55);
        moreHeroes[3] = new Energizer("Thor", 3000);

        moreHeroes[0].setTeam(team2);
        moreHeroes[1].setTeam(team2);
        moreHeroes[2].setTeam(team2);
        moreHeroes[3].setTeam(team2);

        System.out.println(team1.getTeamName());
        System.out.print("Iron Man, ");
        heroes[2].useSuperPower();
        System.out.print("The Hulk, ");
        heroes[1].useSuperPower();
        System.out.print("Thor, ");
        heroes[3].useSuperPower();
        System.out.print("Captain America, ");
        heroes[0].useSuperPower();

        System.out.println(heroes[0].getAge() + heroes[1].getAge() + heroes[0].getAge() + heroes[0].getAge());
//
//        AllTheHeroes teamA = new AllTheHeroes();
//
//        Hero heroA = new Tank();
//        Hero heroB = new Tank();
//        Hero heroC = new ShapeShifter();
//        Hero heroD = new ShapeShifter();
//        System.out.println("adding heroA");
//        teamA.addSuperHero(heroA);
//      //  teamA.addSuperHero(heroB);

        AllTheHeroes avengers = new AllTheHeroes();
        avengers.addSuperHero(heroes[0]);
        avengers.addSuperHero(heroes[1]);
        avengers.addSuperHero(heroes[2]);
        avengers.addSuperHero(heroes[3]);


             avengers.addSuperHero(heroes[1]);

            avengers.removeSuperHero(heroes[1]);

        System.out.println(avengers);

    }
}
