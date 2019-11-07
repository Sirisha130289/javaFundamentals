package be.intecbrussel.w3;


public class StringToChar {
    public static void main(String[] args) {
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        count(test);
    }




    public static void count(String string) {
        char[] ch = string.toCharArray();                   // converting string into character.
        int letter = 0;
        int number = 0;
        int space = 0;
        int others = 0;

        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                number++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                others++;
            }
        }
        System.out.println("Letters:" + letter);
        System.out.println("Numbers: " + number);
        System.out.println("Spaces" + space);
        System.out.println("Others" + others);
    }


}

