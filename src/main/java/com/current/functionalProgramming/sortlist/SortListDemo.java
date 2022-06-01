package com.current.functionalProgramming.sortlist;

import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Employee> employee = DataBase.getEmployee();
        employee.stream().sorted((o1, o2) -> (int) (o2.getSalary()- o1.getSalary())).forEach(System.out::println);
        employee.stream().sorted(Comparator.comparing(empl -> empl.getSalary())).forEach(e -> System.out.println(e));
        employee.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
        employee.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        employee.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);


    }
}



//class MyComparator implements Comparator<Employee>{
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return (int) (o2.getSalary()-(o1.getSalary()));
//    }
//}