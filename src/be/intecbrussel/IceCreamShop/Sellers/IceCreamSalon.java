package be.intecbrussel.IceCreamShop.Sellers;

import be.intecbrussel.IceCreamShop.Eatables.*;


public class IceCreamSalon implements IceCreamSeller {

    private PriceList priceList;

    private double profit;

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    public double getProfit() {
        return profit;
    }

    @Override
    public Cone orderCone(Flavour[] flavours) {

        Cone cone = new Cone(flavours);
        int size = flavours.length;
        double pricePerFlavour = priceList.getBallPrice();
        double amount = pricePerFlavour * size;
        profit = profit + amount;
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket1 = new IceRocket();
        double amount = priceList.getRocketprice();

        profit = profit + amount;
        return iceRocket1;

    }

    @Override
    public Magnum orderMagnum(MagnumType magnum) {
        Magnum magnum1 = new Magnum(magnum);
        double amount = priceList.getMagnumPrice(magnum);

        profit = profit + amount;
        return magnum1;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", profit=" + profit +
                '}';
    }
}
