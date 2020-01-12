package be.intecbrussel.IceCreamShop.Sellers;

import be.intecbrussel.IceCreamShop.Eatables.Flavour;
import be.intecbrussel.IceCreamShop.Eatables.IceRocket;
import be.intecbrussel.IceCreamShop.Eatables.MagnumType;


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
    public void orderCone(Flavour[] flavours) {

    }

    @Override
    public void orderIceRocket(IceRocket iceRocket) {

    }

    @Override
    public void orderMagnum(MagnumType magnum) {

    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", profit=" + profit +
                '}';
    }
}
