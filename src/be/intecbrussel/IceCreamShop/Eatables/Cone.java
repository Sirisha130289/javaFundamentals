package be.intecbrussel.IceCreamShop.Eatables;

public class Cone implements Eatable {

    private Flavour[] balls;

    Cone(){

    }

    public Cone(Flavour[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println("I am eating Cone icecream with ");
    }
}
