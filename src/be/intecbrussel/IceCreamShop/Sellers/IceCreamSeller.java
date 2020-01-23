package be.intecbrussel.IceCreamShop.Sellers;

import be.intecbrussel.IceCreamShop.Eatables.*;
import be.intecbrussel.exceptionsChapter12.NoMoreIceCreamException;

public interface IceCreamSeller {

    public Cone orderCone(Flavour[] flavours) throws NoMoreIceCreamException;

    public IceRocket orderIceRocket() throws NoMoreIceCreamException;

    public Magnum orderMagnum(MagnumType magnum) throws NoMoreIceCreamException;
}
