package be.intecbrussel.FundaPractice.Practice1.Casino;

public class Chip {

    private ChipColor chipColor;

    public Chip(ChipColor chipColor) {
        this.chipColor = chipColor;
    }

    public ChipColor getChipColor() {
        return chipColor;
    }

    public void setChipColor(ChipColor chipColor) {
        this.chipColor = chipColor;
    }
}
