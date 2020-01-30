package be.intecbrussel.collections.exercises.exercise11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CoinApp {
    public static void main(String[] args) {
        Map<Enum,Integer> wallet = new LinkedHashMap<>() ;

        wallet.put(Coin.ONE_CENT,5);
        wallet.put(Coin.TWO_CENT,2);
        wallet.put(Coin.FIVE_CENT,1);
        wallet.put(Coin.TEN_CENT,5);
        wallet.put(Coin.TWENTY_CENT,3);
        wallet.put(Coin.FIFTY_CENT,8);
        wallet.put(Coin.ONE_EURO,2);
        wallet.put(Coin.TWO_EURO,3);


        wallet.entrySet().forEach(System.out::println);

        double sum=0;

    }




}
