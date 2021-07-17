package com.tw.ddd.domain;

import java.util.*;

public class Cart {
    private UUID id;
    private List<CartItem> cartItems;
    private List<CartItem> removedCartItems;
    private String status; // can be changed to enum
    private List<Order> orders;

    public Cart(){
        this.id = UUID.randomUUID();
        cartItems = new ArrayList<>();
        removedCartItems = new ArrayList<>();
        status = "InProgess";
        orders = new ArrayList<>();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void addProduct(Product product, int quantity){
        cartItems.add(new CartItem(product, quantity));
    }

    public void addProduct(Product product){
        addProduct(product, 1);
    }

    public void removeProduct(Product product){
        Optional<CartItem> existingCartItem = cartItems.stream().filter(cartItem -> cartItem.getProduct().equals(product)).findAny();
        if(existingCartItem.isEmpty()){
            throw new IllegalArgumentException("Product does not exist in cart");
        }
        cartItems.remove(existingCartItem.get());
        removedCartItems.add(existingCartItem.get());
    }

    public void viewRemovedItems(){
        for(CartItem item : removedCartItems)
            System.out.println(item.getProduct().getName());
    }

    public String getStatus() {
        return status;
    }

    public void markCartAsCheckedOut() {
        this.status = "CheckedOut";
    }
}
