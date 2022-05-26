package com.algorithm.functionalProgramming.mapFlatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDataBase {
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101, "John", "john@email.com", Arrays.asList("0802222222", "0703322324")),
                new Customer(102, "Smith", "smith@email.com", Arrays.asList("07126377485", "0703322324")),
                new Customer(103, "Peter", "smith@email.com", Arrays.asList("07126377485", "0703322324")),
                new Customer(104, "Kelly", "kely@email.com", Arrays.asList("07126377485", "11111111111"))).collect(Collectors.toList());
    }
}
