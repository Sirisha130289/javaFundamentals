package be.intecbrussel.FundaPractice.CardDeck;

public class Deck {

    private Card[] cards = new Card[52];

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }


    public void makeDeck(Card card) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                cards[i] = card;
                break;
            }
        }

    }

    public void getDeck() {
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }
}
