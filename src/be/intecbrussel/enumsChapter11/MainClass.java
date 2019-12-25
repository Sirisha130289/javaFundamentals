package be.intecbrussel.enumsChapter11;

public class MainClass {
    public static void main(String[] args) {
        // Refer to en existing enum object . Enum cannot be instantiated using new operator
        // Enum objects are always created when Enum variables are declared

        Weekdays weekday = Weekdays.MONDAY;
        weekday.setSpecality("Office start");

        // Enum object has methods name and ordinal
        // Name provides the String name of the declared enum
        // Ordinal gives the position of enum as declared
        System.out.println(weekday.name());
        System.out.println(weekday.ordinal());

        // Enum  has a static method named values, hence it is at enum level and not at object level
        // This gives an array of values
        System.out.println(Weekdays.values());

        // For loop over enum - Loop over Enum name method values(). Not on object
        for (Weekdays value : Weekdays.values()) {
            System.out.println("Day : " + value + " | Ordinal : " + value.ordinal());
        }

        System.out.println(Alarm.ELEVEN.getTime());
        System.out.println(Alarm.ELEVEN.getInfo());
    }

}
