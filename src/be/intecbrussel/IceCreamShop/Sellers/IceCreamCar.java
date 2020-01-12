package be.intecbrussel.IceCreamShop.Sellers;

import be.intecbrussel.IceCreamShop.Eatables.Flavour;
import be.intecbrussel.IceCreamShop.Eatables.IceRocket;
import be.intecbrussel.IceCreamShop.Eatables.MagnumType;


public class IceCreamCar implements IceCreamSeller {

    private PriceList priceList;
 //   private Stock stock;
    private double profit;

    @Override
    public void orderCone(Flavour[] flavours) {

    }

    public void prepareCone(Flavour[] cones){

    }
    @Override
    public void orderIceRocket(IceRocket iceRocket) {

    }

    @Override
    public void orderMagnum(MagnumType magnum) {

    }
}
