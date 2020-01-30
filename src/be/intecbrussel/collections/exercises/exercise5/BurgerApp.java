package be.intecbrussel.collections.exercises.exercise5;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BurgerApp {
    public static void main(String[] args) {
        LinkedList<BurgerOrder> burgerOrderLinkedList = new LinkedList<>();
        burgerOrderLinkedList.add(new BurgerOrder("Cheese", 4));
        burgerOrderLinkedList.add(new BurgerOrder("Coffee", 5));
        burgerOrderLinkedList.add(new BurgerOrder("Cola", 3));
        burgerOrderLinkedList.add(new BurgerOrder("Butter", 1));
        burgerOrderLinkedList.add(new BurgerOrder("Water", 2));

        while( burgerOrderLinkedList.peek()!=null){
            System.out.println(burgerOrderLinkedList.poll());
        }



        Queue<BurgerOrder> burgerOrderPriorityQueue = new PriorityQueue<>(new Comparator<BurgerOrder>() {
            @Override
            public int compare(BurgerOrder o1, BurgerOrder o2) {
                return 0;
            }
        });
       burgerOrderPriorityQueue.add(new BurgerOrder("Coffee",1));
        burgerOrderPriorityQueue.add(new BurgerOrder("Cola", 2));
        burgerOrderPriorityQueue.add(new BurgerOrder("Cheese", 3));
        burgerOrderPriorityQueue.add(new BurgerOrder("Water", 4));
        burgerOrderPriorityQueue.add(new BurgerOrder("Butter", 5));

        System.out.println
                (burgerOrderPriorityQueue);
    }
}
