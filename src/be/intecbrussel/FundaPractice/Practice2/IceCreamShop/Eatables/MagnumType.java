package be.intecbrussel.FundaPractice.Practice2.IceCreamShop.Eatables;

public enum MagnumType {
    MILKCHOCOLOATE(0.5), WHITECHOCOLATE(1.0), BLACKCHOCOLATE(2.0), ALPINENUTS(1.5), ROMANTICSTRAWBERRIES(1.8);

    private double priceFactor;

    MagnumType(double priceFactor) {
        this.priceFactor = priceFactor;
    }

    public double getPriceFactor() {
        return priceFactor;
    }

    public void setPriceFactor(double priceFactor) {
        this.priceFactor = priceFactor;
    }
}
