package com.algorithm.functionalProgramming.supplierDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
//        Supplier<String> supplier = () -> "Hi Dipson";
//        System.out.println(supplier.get());
        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(() -> "Hi Ola"));
    }
}
