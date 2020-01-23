package be.intecbrussel.FundaPractice.Practice2.IceCreamShop.Sellers;

import be.intecbrussel.FundaPractice.Practice2.IceCreamShop.Eatables.*;
import be.intecbrussel.exceptionsChapter12.NoMoreIceCreamException;

public interface IceCreamSeller {
    public Cone orderCone(Flavour[] flavours) throws NoMoreIceCreamException;

    public IceRocket orderIceRocket() throws NoMoreIceCreamException;

    public Magnum orderMagnum(MagnumType magnumType) throws NoMoreIceCreamException;

}
