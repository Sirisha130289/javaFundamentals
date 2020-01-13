package be.intecbrussel.LambdaExpression.Practice;

public class NameClass {
    private String firstName;
    private String lastName;

    public NameClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printFullName(NameInterface nameInterface){

        System.out.println(nameInterface.getFullName(firstName,lastName));
    }
}
