package com.tw.ddd.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {

    private String customerId;
    private Address address;
    private List<Account> accounts;

    public Customer(Address address) {
        this.customerId = UUID.randomUUID().toString();
        this.address = address;
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
