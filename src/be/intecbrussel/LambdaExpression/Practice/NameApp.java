package be.intecbrussel.LambdaExpression.Practice;

public class NameApp {
    public static void main(String[] args) {
        NameClass nameClass = new NameClass("Sirisha","Kalyan");
        nameClass.printFullName((String firstName, String lastName)-> firstName.concat(lastName));
    }
}
