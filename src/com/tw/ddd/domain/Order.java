package com.tw.ddd.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Order {
    private String id;
    private List<CartItem> items;
    private Price totalPrice;

    public Order(List<CartItem> items) throws Exception {
        id = UUID.randomUUID().toString();
        this.items = items;
        totalPrice = getTotalPrice();
    }


    private Price getTotalPrice() throws Exception {
        if(items.isEmpty()) throw new Exception("No Items found");

        BigDecimal totalPrice = BigDecimal.ZERO;
        for(CartItem item : items)
            totalPrice = totalPrice.add(item.getProduct().getPrice().getPrice());

        return new Price(items.get(0).getProduct().getPrice().getCurrency(), totalPrice);

    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", items=" + items +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
