package be.intecbrussel.collections.exercises.shoppingCart;

import java.util.*;

public class Order {


    Map<Customer, List<Product>> shoppingCart = new HashMap<>();
    double sum = 0;

    public void addOrderToCart(Customer customer, List<Product> product) {
        shoppingCart.put(customer, product);
        System.out.println("The below products are added into cart for Customer: " + customer.getCustomerName());
        shoppingCart.get(customer).forEach(System.out::println);
    }

    public void countCart(Customer customer) {
        System.out.println("There are total " + shoppingCart.get(customer).size() + " products in your cart.");
    }

    public void totalCost(List<Product> products) {
        sum = products.stream().mapToDouble(Product::getCostOfProduct).sum();
        System.out.println("The total cost of your order is " + sum + " euros");
    }

    public void deliveryCharges() {
        if (sum >= 10) {
            System.out.println("You are eligible for free shipping");
        } else {
            System.out.println("Your shipping costs are 5 euros as the total order cost is less than 10 euros");
            sum = sum + 5;

        }
        System.out.println("Your total order cost is: " +sum+" euros");
    }

}

