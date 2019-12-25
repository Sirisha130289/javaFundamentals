package be.intecbrussel.enumsChapter11;

public class MainDayApp {
    public static void main(String[] args) {
        for(Day day: Day.values()){
            System.out.println("The Ordinal value of " + day.name()+" is " + day.ordinal()+ " and isWeekday : " + day.isWeekday());
        }

    }
}
