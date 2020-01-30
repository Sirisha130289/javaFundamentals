package be.intecbrussel.collections.exercises.shoppingCart;

import java.math.BigDecimal;
import java.util.*;

public class Order {

    List<Product> products = new ArrayList<>();
    Map<Customer, List<Product>> shoppingCart = new TreeMap<>();

    public void addOrderToCart(Customer customer, List<Product> product) {
        shoppingCart.put(customer, product);
        System.out.println("The below products are added into cart for Customer: " + customer.getCustomerName());
        shoppingCart.get(customer).forEach(System.out::println);
    }

    public void countCart(Customer customer) {
        System.out.println("There are total " + shoppingCart.get(customer).size() + " products in your cart.");
    }

    public void totalCost(Customer customer) {
        Product product = new Product();
//     int total= new BigDecimal(shoppingCart.keySet()
//             .stream().mapToInt( products -> product.setCostOfProduct() * products.get(product) )
//             .sum());

    }

}

