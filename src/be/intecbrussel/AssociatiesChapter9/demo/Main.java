package be.intecbrussel.AssociatiesChapter9.demo;

public class Main {
    public static void main (String[] args)
    {
        Bank bank = new Bank("Axis");
        Employee emp = new Employee("Neha");

        System.out.println(emp.getEmployeeName() +
                " is employee of " + bank.getBankName());
    }
}
