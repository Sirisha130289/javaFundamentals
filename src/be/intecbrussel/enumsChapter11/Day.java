package be.intecbrussel.enumsChapter11;

public enum Day {
    SUNDAY(false),MONDAY(true),TUESDAY(true),WEDNESDAY(true),THURSDAY(true),FRIDAY(true),SATURDAY(false);

    private boolean isWeekday;

    public boolean isWeekday() {
        return isWeekday;
    }

    public void setWeekday(boolean weekday) {
        isWeekday = weekday;
    }

    Day(boolean isWeekday){
        this.isWeekday=isWeekday;
    }

    @Override
    public String toString() {
        return "Day{" +
                "isWeekday=" + isWeekday +
                '}';
    }
}
