package be.intecbrussel.FundaPractice.Practice2.IceCreamShop.Sellers;

import be.intecbrussel.FundaPractice.Practice2.IceCreamShop.Eatables.*;

public class IceCreamSalon implements IceCreamSeller {


    private PriceList priceList;
    private double totalProfit;

    public PriceList getPriceList() {
        return priceList;
    }

    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }

    @Override
    public Cone orderCone(Flavour[] flavours) {


        Cone cone = new Cone(flavours);
        int size = flavours.length;
        double pricePerflavour = priceList.getBallPrice();
        double coneProfit = size * pricePerflavour;
        totalProfit = totalProfit + coneProfit;
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {

        IceRocket iceRocket = new IceRocket();
        double rocketProfit = priceList.getRocketPrice();
        totalProfit = totalProfit + rocketProfit;

        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);
        double magnumProfit = priceList.getMagnumPrice(magnumType);
        totalProfit = totalProfit + magnumProfit;

        return magnum;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
