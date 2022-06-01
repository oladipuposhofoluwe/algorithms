package com.current.functionalProgramming.mapFlatmap;

import java.util.List;

public class OptionalDemo {
    public static Customer getCustomerEmail(String email) throws Exception {
        List<Customer>customers = CustomerDataBase.getAll();
        return customers.stream().filter(customer -> customer.getEmaill().equals(email)).findAny().orElseThrow(()-> new Exception("No such custromer email found"));
    }
}

