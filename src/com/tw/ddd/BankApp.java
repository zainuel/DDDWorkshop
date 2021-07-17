package com.tw.ddd;

import com.tw.ddd.misc.Account;
import com.tw.ddd.misc.Address;
import com.tw.ddd.misc.Customer;
import com.tw.ddd.misc.domainservice.AddressUpdateService;

public class BankApp {


    public static void main(String[] args) {
        Address address = new Address("Address Line 1", "Address Line 2", "City","State",38123);
        Customer customer = new Customer(address);
        customer.addAccount(new Account(address));

        AddressUpdateService addressUpdateService = new AddressUpdateService();
        Address address2 = new Address("New Address Line 1", "New Address Line 2", "City","State",38123);
        addressUpdateService.updateCustomerAddress(customer,address2);

    }


}
