package be.intecbrussel.methodcalls;

public class MainClass {

    static NormalClass normal = new NormalClass();

    public static void main(String[] args) {

        // Direct send a string in method args
        // Declare a string and send the variable by name
        // pass any method which returns a string
        normal.addSalutation("John");
        Person person = new Person("Mary");

        normal.addSalutation(person.getName());

        String name = "Bob";
        normal.addSalutation(name);

        String[] names = {"Jak", "Bak"};

        normal.addSalutation(names[0]);


        Person person1 = normal.getPerson("Jack");

        normal.printPerson(person1);

        int num = 4;
        num = normal.addOne(num);
        System.out.println(num);

        System.out.println("Before changing : " + person1 + person1.hashCode());
        normal.changeName(person1);
        System.out.println("After changing : " + person1 + person1.hashCode());


    }
}
