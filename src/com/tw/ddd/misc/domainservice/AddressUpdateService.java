package com.tw.ddd.misc.domainservice;

import com.tw.ddd.misc.Address;
import com.tw.ddd.misc.Customer;

public class AddressUpdateService {

    public void updateCustomerAddress(Customer customer, Address address ){
        customer.setAddress(address);
        customer.getAccounts().forEach(account -> account.setCustomerAddress(address));
    }
}
