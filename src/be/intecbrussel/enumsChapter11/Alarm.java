package be.intecbrussel.enumsChapter11;

public enum Alarm {

    // Declaring an enum instance variables using a enum constructor
    FIVE(5, "Morning"), ELEVEN(11, "Noon"), TWENTY(20, "Evening");

    private int time;
    private String info;

    // enum can have an overloaded constructor like a class where the instance variables are set

    Alarm(int time, String info) {
        this.time = time;
        this.info = info;
    }
//    // Cannot override name or ordinal methods in enum
//    public String name(){
//        return "213";
//    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}