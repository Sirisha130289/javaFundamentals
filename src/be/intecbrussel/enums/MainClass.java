package be.intecbrussel.enums;

public class MainClass {
    public static void main(String[] args) {
        WeekDays weekDays = WeekDays.THURSDAY;

        System.out.println(weekDays);


        switch (weekDays) {
            case MONDAY:
                System.out.println("This is Monday");
                break;
            case TUESDAY:
                System.out.println("This is tuesday");
                break;
            default:
                System.out.println("some other day");
                break;
        }


    }
}
