package com.tw.ddd.misc;

import java.util.UUID;

public class Account {

    private String accountNumber;
    private Address customerAddress;

    public Account(Address customerAddress) {
        this.accountNumber = UUID.randomUUID().toString();
        this.customerAddress = customerAddress;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }
}
