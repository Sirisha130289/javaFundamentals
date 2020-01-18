package be.intecbrussel.FundaPractice.Casino;

public class Card {

    private SuitType suitType;
    private Value number;

    public SuitType getSuitType() {
        return suitType;
    }

    public void setSuitType(SuitType suitType) {
        this.suitType = suitType;
    }

    public Value getNumber() {
        return number;
    }

    public void setNumber(Value number) {
        this.number = number;
    }

    public Card(SuitType suitType, Value number) {
        this.suitType = suitType;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suitType=" + suitType +
                ", number=" + number +
                '}';
    }
}
