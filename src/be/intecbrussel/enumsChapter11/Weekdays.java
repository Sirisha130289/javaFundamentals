package be.intecbrussel.enumsChapter11;

public enum Weekdays {

    // has a default constructor
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    Weekdays(){

    }

    // enum can have instance variables like a class
    private String specality;

    public String getSpecality() {
        return specality;
    }

    public void setSpecality(String specality) {
        this.specality = specality;
    }
}