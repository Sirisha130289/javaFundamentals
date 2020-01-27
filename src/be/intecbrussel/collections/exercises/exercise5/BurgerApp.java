package be.intecbrussel.collections.exercises.exercise5;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BurgerApp {
    public static void main(String[] args) {
        LinkedList<BurgerOrder> burgerOrderLinkedList = new LinkedList<>();
        burgerOrderLinkedList.add(new BurgerOrder("Sirisha", 1));
        burgerOrderLinkedList.add(new BurgerOrder("Kalyan", 2));
        burgerOrderLinkedList.add(new BurgerOrder("Satwika", 3));
        burgerOrderLinkedList.add(new BurgerOrder("Asish", 4));
        burgerOrderLinkedList.add(new BurgerOrder("Vikram", 5));

        System.out.println
                (burgerOrderLinkedList);

        Queue<BurgerOrder> burgerOrderPriorityQueue = new PriorityQueue<>(new Comparator<BurgerOrder>() {
            @Override
            public int compare(BurgerOrder o1, BurgerOrder o2) {
                return 0;
            }
        });
       burgerOrderPriorityQueue.add(new BurgerOrder("Sirisha",1));
        burgerOrderPriorityQueue.add(new BurgerOrder("Kalyan", 2));
        burgerOrderPriorityQueue.add(new BurgerOrder("Satwika", 3));
        burgerOrderPriorityQueue.add(new BurgerOrder("Asish", 4));
        burgerOrderPriorityQueue.add(new BurgerOrder("Vikram", 5));

        System.out.println
                (burgerOrderPriorityQueue);
    }
}
