package be.intecbrussel.enumsChapter11;

public class ColorApp {
    public static void main(String[] args) {
        Color color1 = Color.RED;
        Color color2 = Color.GREEN;

        printColor(color1);
        printColor(color2);

    }

    public static void printColor(Color color) {
        System.out.println(color.name());
        System.out.println(color.ordinal());
        String text = null;
        switch (color) {
            case BLACK:
                text = "Black";
                break;
            case WHITE:
                text = "White";
                break;
            case RED:
                text = "Red";
                break;
            case GREEN:
                text = "Green";
                break;
            case BLUE:
                text = "Blue";
                break;
            case YELLOW:
                text = "Yellow";
                break;
            default:
                text = "Null";
                break;

        }
        for (Color c: Color.values()){
            System.out.println(c);

        }
        System.out.println(text);
        Color color3 = Color.valueOf("BLACK");
    }
}
