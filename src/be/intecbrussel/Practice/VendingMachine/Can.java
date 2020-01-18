package be.intecbrussel.Practice.VendingMachine;

public enum Can {

    COLA(1.2), FANTA(1.5),ICETEA(2), SPA(1);

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    Can(double amount) {
        this.amount = amount;
    }
}
