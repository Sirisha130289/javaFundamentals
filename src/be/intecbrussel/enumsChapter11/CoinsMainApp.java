package be.intecbrussel.enumsChapter11;

public class CoinsMainApp {
    public static void main(String[] args) {
        Coin oneCent = Coin.ONECENT;  //referring to the object ONECENT with the variable name oneCent;
        oneCent.setValue(1); // setting the property of enum which is value;

        Coin twoCent = Coin.TWOCENT;
        twoCent.setValue(2);

        Coin fiveCent = Coin.FIVECENT;
        fiveCent.setValue(5);

        Coin tenCent = Coin.TENCENT;
        tenCent.setValue(10);

        Coin twentyCent = Coin.TWENTYCENT;
        twentyCent.setValue(20);

        Coin fiftyCent = Coin.FIFTYCENT;
        fiftyCent.setValue(50);

        Coin oneEuro = Coin.ONEEURO;
        oneEuro.setValue(100);

        Coin twoEuro = Coin.TWOEURO;
        twoEuro.setValue(200);

        Coin coin[] = new Coin[8];

        coin[0] = oneCent;
        coin[1]= twoCent;
        coin[2]=fiveCent;
        coin[3]=tenCent;
        coin[4]=twentyCent;
        coin[5]=fiftyCent;
        coin[6]=oneEuro;
        coin[7]=twoEuro;

        int total=0;

        for(int i=0; i<coin.length;i++){
            total += coin[i].getValue();
        }
        System.out.println(total);
    }

}
