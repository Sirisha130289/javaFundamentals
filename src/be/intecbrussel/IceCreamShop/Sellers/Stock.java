package be.intecbrussel.IceCreamShop.Sellers;

public class Stock {
    private int iceRockets;
    private int cones;
    private int balls;
    private int magni;

    public int getIceRockets() {
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }

    public int getCones() {
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getMagni() {
        return magni;
    }

    public void setMagni(int magni) {
        this.magni = magni;
    }

    public Stock(int iceRockets, int cones, int balls, int magni) {
        this.iceRockets = iceRockets;
        this.cones = cones;
        this.balls = balls;
        this.magni = magni;
    }

    public void decrementCone() {
        this.cones--;
    }

    public void decrementRockets() {
        this.iceRockets--;
    }

    public void decrementMagni() {
        this.magni--;
    }

    public void decrementBalls(int noOfBalls) {
        this.balls= balls-noOfBalls;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "iceRockets=" + iceRockets +
                ", cones=" + cones +
                ", balls=" + balls +
                ", magni=" + magni +
                '}';
    }
}
