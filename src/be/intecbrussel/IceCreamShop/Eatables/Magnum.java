package be.intecbrussel.IceCreamShop.Eatables;

public class Magnum implements Eatable {

    private MagnumType type;

    Magnum(){

    }
    public Magnum(MagnumType type) {
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("I am eating Magnum icecream");
    }

    public MagnumType getType() {
        return type;
    }
}
