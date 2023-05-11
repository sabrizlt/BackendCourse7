package Esercizio2;

import java.util.ArrayList;
import java.util.List;

class Order {
    private List<OrderItem> orderItems;

    public Order() {
        this.orderItems = new ArrayList<>();
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    @Override
    public String toString() {
        long babyProductCount = orderItems.stream()
                .filter(item -> item.getProduct().getCategory().equals("Baby"))
                .count();
        return babyProductCount + " Ordini baby";
    }

}

