package be.intecbrussel.inheritancePracticeExercises.hero;

public class HeroApp {
    public static void main(String[] args) {
        Hero[] theJusticeLeague =new Hero[4];
        theJusticeLeague[0] = new ArmedHero("Bruce",45);
        theJusticeLeague[1] = new Tank("Clark Kent", 5000);
        theJusticeLeague[2] = new ShapeShifter("Barry Allen",32);
        theJusticeLeague[3]= new Energizer("Gibson Rickenbacker",40);

        Hero[]theAvengers = new Hero[4];
        theAvengers[0] = new ArmedHero("Steve Rogers",98);
        theAvengers[1] = new Tank("Bruce Banner",50);
        theAvengers[2] = new ShapeShifter("Tony Stark",55);
        theAvengers[3]= new Energizer("Thor",3000);
//        public void print(Hero[]){
//            return ;
//        }
//
//
//
//        public void printHeader(){
//
//        }
//        public boolean FancyLines(){
//
//        }
    }
}
