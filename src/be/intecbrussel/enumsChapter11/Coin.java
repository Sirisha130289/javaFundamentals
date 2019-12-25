package be.intecbrussel.enumsChapter11;

public enum Coin {
    ONECENT, TWOCENT, FIVECENT, TENCENT, TWENTYCENT, FIFTYCENT, ONEEURO, TWOEURO; //enum objects created.

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
