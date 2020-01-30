package be.intecbrussel.collections.exercises.shoppingCart;

import java.util.*;

public class ShoppingApp {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Order order = new Order();
        Map<Customer, List<Product>> shoppingCart = new HashMap<>();

        Customer customer1 = new Customer(1819, "Sirisha");
        Customer customer2 = new Customer(1920, "Satwika");
        Customer customer3 = new Customer(2021, "Pavan");

        Product product1 = new Product("Lentils", 101,6);
        Product product2 = new Product("Gram", 102,7);
        Product product3 = new Product("Salt", 103,1);
        Product product4 = new Product("Sugar", 104,2);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        shoppingCart.put(customer1, (List<Product>) products);
        shoppingCart.put(customer2, (List<Product>) products);
        shoppingCart.put(customer1, (List<Product>) products);
        shoppingCart.put(customer3, (List<Product>) products);


        order.addOrderToCart(customer1, products);
        order.countCart(customer1);
        order.totalCost(customer1);


    }
}
