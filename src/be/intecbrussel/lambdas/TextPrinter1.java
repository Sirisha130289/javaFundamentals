package be.intecbrussel.lambdas;

public class TextPrinter1 {

    private String firstName;
    private String lastName;

    public TextPrinter1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getFullName(NameJoiner joiner) {
        String fullName =joiner.joinNames(firstName, lastName);
        System.out.println(fullName);
    }


    public static void main(String[] args) {
        TextPrinter1 textPrinter1 = new TextPrinter1("Sirisha", "Kalyan");
        textPrinter1.getFullName((String firstName, String lastName) -> firstName.concat(lastName));
    }
}
