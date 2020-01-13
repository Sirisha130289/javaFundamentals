package be.intecbrussel.LambdaExpression.Practice;

public class TextPadder {
    private int size;

    public TextPadder(int size) {
        this.size = size;
    }

    public String pad(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for (int i = 0; i < size - s.length(); i++) {
            sb.append(' ');
        }

        return sb.toString();
    }
    public static void main(String[] args) {


    }
}


