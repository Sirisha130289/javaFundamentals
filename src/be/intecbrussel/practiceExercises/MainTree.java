package be.intecbrussel.practiceExercises;

public class MainTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        for (int i = 0; i < 20; i++) {
            TreeElement e = new TreeElement();
            tree.addElement(e);
            System.out.println("Element addded to tree: ");
        }
        tree.printCount();
    }
}
