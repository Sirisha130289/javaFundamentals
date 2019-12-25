package be.intecbrussel.enumsChapter11;

public class MonthApp {

    public static void checkMonth(Months months) {
        switch (months) {
            case JANUARY:
                System.out.println("Its winter");
                break;
            case FEBRUARY:
                System.out.println("Its my birthday");
                break;
            case SEPTEMBER:
                System.out.println("Satwikas birthday");
                break;
            case JUNE:
                System.out.println("Anniversary");
                break;
            default:
                System.out.println("Other month");
                break;
        }

    }

    public static void main(String[] args) {
        Months month1 = Months.JANUARY;
        Months month2 = Months.APRIL;
        Months month3 = Months.FEBRUARY;
        Months month4 = Months.JUNE;

        checkMonth(month1);
        checkMonth(month2);
        checkMonth(month3);
        checkMonth(month4);
    }
}
