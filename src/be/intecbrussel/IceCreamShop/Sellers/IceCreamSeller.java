package be.intecbrussel.IceCreamShop.Sellers;

import be.intecbrussel.IceCreamShop.Eatables.Flavour;
import be.intecbrussel.IceCreamShop.Eatables.IceRocket;
import be.intecbrussel.IceCreamShop.Eatables.MagnumType;

public interface IceCreamSeller {

    public void orderCone(Flavour[] flavours);

    public void orderIceRocket(IceRocket iceRocket);

    public void orderMagnum(MagnumType magnum);
}
