package be.intecbrussel.IceCreamShop.Sellers;

import be.intecbrussel.IceCreamShop.Eatables.MagnumType;

public class PriceList {

    private double ballPrice;
    private double rocketprice;
    private double magnumStandardPrice;

    PriceList() {

    }

    public PriceList(double ballPrice, double rocketprice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketprice = rocketprice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketprice() {
        return rocketprice;
    }

    public void setRocketprice(double rocketprice) {
        this.rocketprice = rocketprice;
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
            case MILKCHOCOLATE:
                price = MagnumType.MILKCHOCOLATE.getPriceFactor()* getMagnumStandardPrice();
                break;
            case WHITECHOCOLATE:
            case ROMANTICSTRAWBERRIES:
                price = MagnumType.ROMANTICSTRAWBERRIES.getPriceFactor()*  getMagnumStandardPrice();
                break;
            case BLACKCHOCOLATE:
                price = MagnumType.BLACKCHOCOLATE.getPriceFactor()* getMagnumStandardPrice();
                break;
            case ALPINENUTS:
                price = MagnumType.ALPINENUTS.getPriceFactor()* getMagnumStandardPrice();
                break;
            default:
                break;
        }
        return price;
    }
}

