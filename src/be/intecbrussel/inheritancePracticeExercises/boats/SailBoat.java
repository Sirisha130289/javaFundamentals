package be.intecbrussel.inheritancePracticeExercises.boats;

public class SailBoat extends Boat {
    private int sailSize;
    private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSailSize() {
        return sailSize;
    }

    public void setSailSize(int sailSize) {
        this.sailSize = sailSize;
    }

  @Override
  public void accelerate() {
    super.accelerate();
    System.out.println("The wind blows the sails and accelerates the ship.");
  }
}

