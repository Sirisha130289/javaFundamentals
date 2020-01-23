package be.intecbrussel.FundaPractice.Practice2.IceCreamShop.Sellers;

import be.intecbrussel.FundaPractice.Practice2.IceCreamShop.Eatables.MagnumType;

public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumStandardPrice() {
        return magnumStandardPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getMagnumPrice(MagnumType magnumType) {
        double price = 0.0;
        switch (magnumType) {
            case ALPINENUTS:
                price = MagnumType.ALPINENUTS.getPriceFactor() * getMagnumStandardPrice();
                break;
            case WHITECHOCOLATE:
                price = MagnumType.WHITECHOCOLATE.getPriceFactor() * getMagnumStandardPrice();
                break;
            case ROMANTICSTRAWBERRIES:
                price = MagnumType.ROMANTICSTRAWBERRIES.getPriceFactor() * getMagnumStandardPrice();
                break;
            case BLACKCHOCOLATE:
                price = MagnumType.BLACKCHOCOLATE.getPriceFactor() * getMagnumStandardPrice();
                break;
            case MILKCHOCOLOATE:
                price = MagnumType.MILKCHOCOLOATE.getPriceFactor() * getMagnumStandardPrice();
                break;
            default:
                break;
        }
        return price;
    }
}
