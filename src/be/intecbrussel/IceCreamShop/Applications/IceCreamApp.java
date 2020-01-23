package be.intecbrussel.IceCreamShop.Applications;

import be.intecbrussel.IceCreamShop.Eatables.*;
import be.intecbrussel.IceCreamShop.Sellers.IceCreamCar;
import be.intecbrussel.IceCreamShop.Sellers.IceCreamSalon;
import be.intecbrussel.IceCreamShop.Sellers.PriceList;
import be.intecbrussel.IceCreamShop.Sellers.Stock;
import be.intecbrussel.IceCreamShop.exception.NoMoreIceCreamException;

public class IceCreamApp {
    public static void main(String[] args) throws NoMoreIceCreamException {
        PriceList priceList = new PriceList(3.0, 2.0, 1.5);
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);

        Flavour[] flavours = new Flavour[3];
        flavours[0] = Flavour.CHOCOLATE;
        flavours[1] = Flavour.VANILLA;
        flavours[2] = Flavour.STRAWBERRY;

        Cone cone = iceCreamSalon.orderCone(flavours);
        IceRocket iceRocket = iceCreamSalon.orderIceRocket();
        Magnum magnum= iceCreamSalon.orderMagnum(MagnumType.BLACKCHOCOLATE);

        double totalProfit = iceCreamSalon.getTotalProfit();
        System.out.println(totalProfit);

        Stock stock = new Stock(4, 2, 6, 3);
        System.out.println("Stock before order" + stock);

        IceCreamCar iceCreamCar = new IceCreamCar(priceList, stock);
        Cone cone1 = iceCreamCar.orderCone(flavours);
        IceRocket iceRocket1 = iceCreamCar.orderIceRocket();
        Magnum magnum1 = iceCreamCar.orderMagnum(MagnumType.ALPINENUTS);
        Cone cone2 = iceCreamCar.orderCone(flavours);
        IceRocket iceRocket2 = iceCreamCar.orderIceRocket();
        Magnum magnum2 = iceCreamCar.orderMagnum(MagnumType.ALPINENUTS);
        Cone cone3 = iceCreamCar.orderCone(flavours);
        IceRocket iceRocket3 = iceCreamCar.orderIceRocket();
        Magnum magnum3 = iceCreamCar.orderMagnum(MagnumType.ALPINENUTS);


        System.out.println("Stock after order" + stock);

        double totalProfit1 = iceCreamCar.getProfit();
        System.out.println(totalProfit1);


    }


}
