package be.intecbrussel.w3;

public class StringEx {

    public static void main(String[] args) {
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";


        String space = " ";
        int alphabetCount = 0;
        int numberCount = 0;
        int spaceCount = 0;
        int otherCount = 0;


        String text = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33 ";
        for (int i = 0; i < text.length(); i++) {
            String slice = text.substring(i, i + 1);
            if (alphabets.contains(slice)) {
                alphabetCount++;
            } else if (numbers.contains(slice)) {
                numberCount++;
            } else if (space.contains(slice)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("Alphabets count = " + alphabetCount);
        System.out.println("Numbers count = " + numberCount);
        System.out.println("Space count = " + spaceCount);
        System.out.println("Others count = " + otherCount);

    }
}
