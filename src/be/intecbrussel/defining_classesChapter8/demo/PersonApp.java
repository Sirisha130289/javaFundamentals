package be.intecbrussel.defining_classesChapter8.demo;

public class PersonApp {
    public static void main(String[] args) {

        //declaring and initializing the variables that point to Person object.
        Person sister = new Person();
        Person brother = new Person();

        sister.setName("Anne");
        sister.setAge(40);
        sister.setHeight(1.68);

        System.out.println("Name of the Sister: " + sister.getName());
        System.out.println("Age of Sister: " + sister.getAge());
        System.out.println("Height of Sister: " + sister.getHeight());
        System.out.println("Adress of Sister: " + sister);
    }
}
