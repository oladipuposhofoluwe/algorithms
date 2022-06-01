package com.current.functionalProgramming.comsumerInterface;

import java.util.Arrays;
import java.util.List;

public class ConsumerInterfaceDemo {

    public static void main(String[] args) {
    // Consumer<Integer> consumer = t -> System.out.println("Printing : " + t);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        list1.stream().forEach(t -> System.out.println("Printing : " + t));
    }

    //consumer takes in an argument but never return anything
//    @Override
//    public void accept(Integer integer) {
//        System.out.println("Printing : " + t);
//    }
}
