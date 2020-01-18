package be.intecbrussel.IceCreamShop.Eatables;

public enum MagnumType {

    MILKCHOCOLATE(1.6), WHITECHOCOLATE(1.8), BLACKCHOCOLATE(3.6), ALPINENUTS(1.5), ROMANTICSTRAWBERRIES(1.8);

   private double priceFactor;

    public double getPriceFactor() {
        return priceFactor;
    }

    public void setPriceFactor(double priceFactor) {
        this.priceFactor = priceFactor;
    }

    MagnumType(double priceFactor) {
        this.priceFactor = priceFactor;
    }
}
