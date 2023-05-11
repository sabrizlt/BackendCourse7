package Esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();

        Order order1 = new Order();
        order1.addOrderItem(new OrderItem(new Product("Baby" )));
        order1.addOrderItem(new OrderItem(new Product("Man")));
        order1.addOrderItem(new OrderItem(new Product("Girl")));
        order1.addOrderItem(new OrderItem(new Product("Baby")));
        order1.addOrderItem(new OrderItem(new Product("Baby")));
        orderList.add(order1);

       

        List<Order> filteredOrders = orderList.stream()
                .filter(order -> order.getOrderItems().stream()
                        .anyMatch(item -> item.getProduct().getCategory().equals("Baby")))
                .collect(Collectors.toList());

        for (Order order : filteredOrders) {
            System.out.println("Ordine: " + order);
        }
    }
}

