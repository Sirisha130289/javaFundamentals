package be.intecbrussel.FundaPractice.Casino;

public class Table {

    private CasinoPlayer[] players= new CasinoPlayer[5];
    protected CardDealer dealer;

    public CasinoPlayer[] getPlayers() {
        return players;
    }

    public void setPlayers(CasinoPlayer[] players) {
        this.players = players;
    }

    public CardDealer getDealer() {
        return dealer;
    }

    public void setDealer(CardDealer dealer) {
        this.dealer = dealer;
    }

    public Table(CasinoPlayer[] players, CardDealer dealer) {
        this.players = players;
        this.dealer = dealer;
    }

    public void startGame(){

    }

    private void cleanTable(){

    }

}
