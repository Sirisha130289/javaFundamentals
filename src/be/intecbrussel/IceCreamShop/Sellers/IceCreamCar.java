package be.intecbrussel.IceCreamShop.Sellers;

import be.intecbrussel.IceCreamShop.Eatables.*;
import be.intecbrussel.IceCreamShop.exception.NoMoreIceCreamException;


public class IceCreamCar {
    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    public PriceList getPriceList() {
        return priceList;
    }

    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public Cone orderCone(Flavour[] flavours) throws NoMoreIceCreamException {

        Cone cone;

        if (stock.getCones() > 0 && (stock.getBalls() > flavours.length)) {
            cone = new Cone(flavours);
            stock.decrementCone();
            stock.decrementBalls(flavours.length);
        } else {
            throw new NoMoreIceCreamException("No more balls or cones in stock");
        }
        double coneProfit = priceList.getBallPrice();
        profit = profit + coneProfit;
        return cone;


    }

    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        IceRocket iceRocket;
        if (stock.getIceRockets() > 0) {
            iceRocket = new IceRocket();
            stock.decrementRockets();
        } else {
            throw new NoMoreIceCreamException("No more Ice Rockets in stock");
        }
        double rocketProfit = priceList.getRocketprice();
        profit = profit + rocketProfit;
        return iceRocket;

    }

    public Magnum orderMagnum(MagnumType magnumType) throws NoMoreIceCreamException {
        Magnum magnum;
        if (stock.getMagni() > 0) {
            magnum = new Magnum(magnumType);
            stock.decrementMagni();
        } else {
            throw new NoMoreIceCreamException("No more Magnums in stock");
        }
        double magnumProfit = priceList.getMagnumPrice(magnumType);
        profit = profit + magnumProfit;
        return magnum;
    }

    @Override
    public String toString() {
        return "IceCreamCar{" +
                "priceList=" + priceList +
                ", stock=" + stock +
                ", profit=" + profit +
                '}';
    }
}
