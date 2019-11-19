package be.intecbrussel.inheritancePracticeExercises.boats;

public class SpeedBoat  extends Boat {

    private   int horsePower;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("The fastBoy goes into higher gear.");
    }
}
