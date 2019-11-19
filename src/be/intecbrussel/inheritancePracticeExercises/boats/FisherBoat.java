package be.intecbrussel.inheritancePracticeExercises.boats;

public class FisherBoat extends Boat {
private int netSize;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNetSize() {
        return netSize;
    }

    public void setNetSize(int netSize) {
        this.netSize = netSize;
    }

    private DeckHand deckHand = new DeckHand();
    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("The fishing boat lifts the net and progresses faster.");
    }
}
