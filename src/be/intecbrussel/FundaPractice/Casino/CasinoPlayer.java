package be.intecbrussel.FundaPractice.Casino;

public class CasinoPlayer {

    private double money;
    private Chip[] chips = new Chip[5];
    private String name;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Chip[] getChips() {
        return chips;
    }

    public void setChips(Chip[] chips) {
        this.chips = chips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CasinoPlayer(double money, Chip[] chips, String name) {
        this.money = money;
        this.chips = chips;
        this.name = name;
    }
}
