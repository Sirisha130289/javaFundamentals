package be.intecbrussel.IceCreamShop.Applications;

import be.intecbrussel.IceCreamShop.Eatables.*;
import be.intecbrussel.IceCreamShop.Sellers.IceCreamSalon;
import be.intecbrussel.IceCreamShop.Sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(3.0, 2.0, 1.5);
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);

        Flavour[] flavours = new Flavour[3];
        flavours[0] = Flavour.CHOCOLATE;
        flavours[1] = Flavour.VANILLA;
        flavours[2] = Flavour.STRAWBERRY;

        Cone cone = iceCreamSalon.orderCone(flavours);
        IceRocket iceRocket = iceCreamSalon.orderIceRocket();
        Magnum magnum= iceCreamSalon.orderMagnum(MagnumType.BLACKCHOCOLATE);

        double totalProfit = iceCreamSalon.getProfit();
        System.out.println(totalProfit);
    }
}
