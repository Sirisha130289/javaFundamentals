package be.intecbrussel.FundaPractice.CarEnum;

public enum BrandName {
    AUDI(1800), PORSCHE(1400), BMW(2100), TESLA(3200), PEUGOT(1500);

    private double weight;


    public double getWeight() {
        return weight;
    }

    BrandName(double weight) {
        this.weight = weight;
    }
}
