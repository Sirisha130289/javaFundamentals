package be.intecbrussel.FundaPractice.CardDeck;

import java.util.Random;

public class CardMain {
    public static void main(String[] args) {

        Deck deck = new Deck();

        for(int i =0; i<52; i++){
            deck.makeDeck(new Card(getSuitType(), getValue()));
        }

        deck.getDeck();
    }

    public static SuitType getSuitType() {
        SuitType suitType = null;
        Random rand = new Random();
        int randomNumber = rand.nextInt(SuitType.values().length);
        switch (randomNumber) {
            case 0:
                suitType = SuitType.CLUBS;
                break;
            case 1:
                suitType = SuitType.SPADES;
                break;
            case 2:
                suitType = SuitType.HEARTS;
                break;
            case 3:
                suitType = SuitType.DIAMONDS;
                break;
            default:
                break;
        }
        return suitType;
    }

    public static Value getValue() {
        Value value = null;
        Random rand = new Random();
        int randomNumber = rand.nextInt(Value.values().length);
        switch (randomNumber) {
            case 0:
                value = Value.ACE;
                break;
            case 1:
                value = Value.TWO;
                break;
            case 2:
                value = Value.THREE;
                break;
            case 3:
                value = Value.FOUR;
                break;
            case 4:
                value = Value.FIVE;
                break;
            case 5:
                value = Value.SIX;
                break;
            case 6:
                value = Value.SEVEN;
                break;
            case 7:
                value = Value.EIGHT;
                break;
            case 8:
                value = Value.NINE;
                break;
            case 9:
                value = Value.TEN;
                break;
            case 10:
                value = Value.QUEEN;
                break;
            case 11:
                value = Value.KING;
                break;
            case 12:
                value = Value.JACK;
                break;
            default:
                break;
        }
        return value;
    }
}