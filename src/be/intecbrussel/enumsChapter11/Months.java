package be.intecbrussel.enumsChapter11;

public enum Months {
    JANUARY(31, "Winter"), FEBRUARY(28, "Winter"), MARCH(31, "Winter"), APRIL(30, "Summer"), MAY(31, "Summer"), JUNE(30, "Summer"),
    JULY(31, "Summer"), AUGUST(31, "Autumn"), SEPTEMBER(30, "Autumn"), OCTOBER(31, "Autumn"),
    NOVEMBER(30, "Autumn"), DECEMBER(31, "Winter");

    private int days;
    private String season;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    Months(int days, String season) {
        this.days = days;
        this.season = season;
    }

}
