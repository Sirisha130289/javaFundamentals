package be.intecbrussel.OOPChapter6.ex6_3;


public class StringEx {

    public static void main(String[] args) {


        String text = new String("life is beautiful");

        String otherText = "Live Life To The Fullest";
        System.out.println("1. The length of the text is:" + (text.length())); //length of the screen

        text = text.toUpperCase();
        System.out.println("2. The capital letters of the text is : " + (text)); //printing in capital letters

        otherText = otherText.toLowerCase();
        System.out.println("3.The small letters of the text is : " + (otherText)); //printing in small letters

        text = text.replace("o", "a");

        System.out.println("4. When character o is replaced by a : " + (text));

        int counter = 0;
        int i;
        for (i = 0; i < text.length(); i++) {

            //if ((text.substring(i,i+1).equalsIgnoreCase("e"))) {
            if(text.charAt(i)=='E'){
                counter++;
            }
        }
        System.out.println("5. The number of letters 'e' in the given text is: " + counter);

        System.out.println("6. Checking if the two texts are same or not :" + (text == otherText));



    }
}

