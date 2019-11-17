package be.intecbrussel.equals;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setId(542);
        person1.setName("ABS");

        person2.setId(542);
        person2.setName("ABS");
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
