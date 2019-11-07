package be.intecbrussel.practiceExercises;

public class Counter {

    int counter = 0;                                            //properties

    public void increment() {                                    //keeping track of the tree count
        this.counter++;
    }

    public void printCount() {                                                          //printing the counter
        System.out.println("Current count :" + this.counter);
    }
}

