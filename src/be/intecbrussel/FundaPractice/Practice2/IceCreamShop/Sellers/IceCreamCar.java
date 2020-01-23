package be.intecbrussel.FundaPractice.Practice2.IceCreamShop.Sellers;

import be.intecbrussel.FundaPractice.Practice2.IceCreamShop.Eatables.*;
import be.intecbrussel.exceptionsChapter12.NoMoreIceCreamException;


public class IceCreamCar implements IceCreamSeller {

    private PriceList priceList;
    private Stock stock;
    private double profit;


    public IceCreamCar() {
    }

    @Override
    public Cone orderCone(Flavour[] flavours) throws NoMoreIceCreamException {

        Cone cone;

        if ((stock.getBalls() > flavours.length) && (stock.getCones() > 0)) {
            cone = new Cone(flavours);
            stock.decrementCones();
            stock.decrementBalls(flavours.length);
        } else {
            throw new NoMoreIceCreamException("No more cones or flavour balls in stock");
        }
        double coneProfit = priceList.getBallPrice();
        profit = profit + coneProfit;
        return cone;
    }

    public Cone prepareCone(Flavour[] flavours) {
        Cone cone = new Cone(flavours);
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        IceRocket iceRocket;
        if (stock.getIceRockets() > 0) {
            iceRocket = new IceRocket();
            stock.decrementIceRockets();
        } else {
            throw new NoMoreIceCreamException("No more rockets in the stock");
        }
        double rocketProfit = priceList.getRocketPrice();
        profit = profit + rocketProfit;
        return iceRocket;
    }

    public IceRocket prepareIceRocket() {
        IceRocket iceRocket = new IceRocket();
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) throws NoMoreIceCreamException {
        Magnum magnum;
        if (stock.getMagni() > 0) {
            magnum = new Magnum(magnumType);
            stock.decrementMagnum();
        } else {
            throw new NoMoreIceCreamException("No more magnu types in stock");
        }
        double magnumProfit = priceList.getRocketPrice();
        profit = profit + magnumProfit;
        return magnum;
    }

    public Magnum prepareMagnum(MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);
        return magnum;
    }

    public double getProfit() {
        return profit;
    }
}
