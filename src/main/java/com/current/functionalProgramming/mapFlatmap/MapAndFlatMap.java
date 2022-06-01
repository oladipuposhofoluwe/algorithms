package com.current.functionalProgramming.mapFlatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) throws Exception {
        List<Customer> customerList = CustomerDataBase.getAll();

        //List<Customer> convert to List<String> -> data transformation
        //mapping : customer -> customer.getEmail
        //custormer -> customer-getEmail is One to One mapping...
        List<String> customerEmails = customerList.stream().map(Customer::getEmaill).collect(Collectors.toList());
        System.out.println(customerEmails);

        //customer -> customer.getPhoneNumber() in this case One customer has many phonenumber.
        //this requires FlatMap instead of Map... this is One to Many
        List<List<String>> customerPhoneNumber = customerList.stream()  //just a list > map
                .map(customer -> customer.getPhonenumber())
                .collect(Collectors.toList());

        List<String> phoneNumber = customerList.stream() // nexted list -> FLATMAP
                .flatMap(customer -> customer.getPhonenumber().stream())
                .collect(Collectors.toList());

        System.out.println("ORDINARY MAP RESULT " + customerPhoneNumber);
        System.out.println(" FLAT MAP RESULT " + phoneNumber);

        OptionalDemo.getCustomerEmail("PRG");
    }
}
