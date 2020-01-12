package be.intecbrussel.methodcalls;

public class NormalClass {

    private final String[] NAMES = {"John", "Mary", "Suzi"}; // INLINE Array declaration.

    public void addSalutation(String name) {

        System.out.println("Mr . " + name);
    }

    public Person getPerson(String name) {

        if ("John".equals(name)) {
            return new Person("John");
        }
        return new Person("No Name");
    }

    public void printPerson(Person person){
        System.out.println(person);
    }

    public int addOne(int number){
        ++number;
        System.out.println("Inside method : " + number);

        return number;
    }

    public void changeName(Person person){
        person.setName("Bob");
    }


}
