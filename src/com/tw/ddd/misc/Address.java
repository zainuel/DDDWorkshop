package com.tw.ddd.misc;

public class Address {

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private int pinCode;

    public Address(String addressLine1, String addressLine2, String city, String state, int pinCode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getPinCode() {
        return pinCode;
    }
}

