package com.current.functionalProgramming.reducaMap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {
    public static List<Employee> getAllEmployees(){
        return Stream.of(
                new Employee(101, "John", "A", 60000),
                new Employee(102, "Peter", "B", 30000),
                new Employee(103, "mak", "A", 80000),
                new Employee(104, "kim", "A", 90000),
                new Employee(105, "json", "C", 15000)
        ).collect(Collectors.toList());
    }
}
