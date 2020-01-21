package be.intecbrussel.IceCreamShop.Sellers;

import be.intecbrussel.IceCreamShop.Eatables.*;


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

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public Cone orderCone(Flavour[] flavours) {
        Cone cone = new Cone(flavours);
        double coneProfit = flavours.length * priceList.getBallPrice();
        totalProfit = totalProfit+coneProfit;
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        double rocketProfit = priceList.getRocketprice();
        totalProfit = totalProfit+rocketProfit;
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) {

        Magnum magnum1 = new Magnum(magnumType);
        double magnumProfit = priceList.getMagnumPrice(magnumType);
        totalProfit = totalProfit+magnumProfit;
        return magnum1;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }


}

