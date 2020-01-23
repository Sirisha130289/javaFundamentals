package be.intecbrussel.IceCreamShop.Sellers;

import be.intecbrussel.IceCreamShop.Eatables.*;
import be.intecbrussel.exceptionsChapter12.NoMoreIceCreamException;


public class IceCreamCar implements IceCreamSeller {

    private PriceList priceList;
    private Stock stock;
    private double profit;

    @Override
    public Cone orderCone(Flavour[] flavours) throws NoMoreIceCreamException {
        Cone cone;
        if ((stock.getCones() > 0) && stock.getBalls() > flavours.length) {
            cone = new Cone(flavours);
            stock.decrementCone();
            stock.decrementBalls(flavours.length);
        } else {
            throw new NoMoreIceCreamException("No more cones or balls in stock");
        }
        double coneProfit = priceList.getBallPrice();
        profit = profit + coneProfit;
        return cone;
    }

    public Cone prepareCone(Flavour[] cones) {
        Cone cone = new Cone(cones);
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        IceRocket iceRocket;
        if (stock.getIceRockets() > 0) {
            iceRocket = new IceRocket();
            stock.decrementRockets();
        } else {
            throw new NoMoreIceCreamException("No more ice rockets in stock");
        }

        double rocketProfit = priceList.getRocketprice();
        profit = profit + rocketProfit;
        return iceRocket;
    }

    public IceRocket prepareRocket() {
        IceRocket iceRocket = new IceRocket();
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType magnum) throws NoMoreIceCreamException {
        Magnum magnum1;
        if (stock.getMagni() > 0) {
            magnum1 = new Magnum(magnum);
            stock.decrementMagni();
        } else {
            throw new NoMoreIceCreamException("No more Magnum in Stock");
        }
        double magnumProfit = priceList.getMagnumPrice(magnum);
        profit = profit + magnumProfit;
        return magnum1;
    }

    public Magnum prepareMagnum(MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);
        return magnum;
    }

    public double getProfit() {

        return profit;

    }

}
