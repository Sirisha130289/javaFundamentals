package be.intecbrussel.IceCreamShop.Sellers;

import be.intecbrussel.IceCreamShop.Eatables.*;

public interface IceCreamSeller {

    public Cone orderCone(Flavour[] flavours);

    public IceRocket orderIceRocket();

    public Magnum orderMagnum(MagnumType magnum);
}
