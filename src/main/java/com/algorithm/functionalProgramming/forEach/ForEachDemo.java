package com.algorithm.functionalProgramming.forEach;

import java.util.*;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("D");
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");

        list.stream().filter(l -> l.startsWith("A")).forEach(s -> System.out.println(s));

        Collections.sort(list);  //ascending
        System.out.println("SORT " +  list);
        Collections.reverse(list); //descending
        System.out.println(list);
        list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s)); //descending

        /*
        for (String l: list) {
            System.out.println(l);
        }
         */

        //list.stream().forEach(l -> System.out.println(l));

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);
        myMap.put("Four", 4);
        myMap.put("Five", 5);

        //myMap.forEach((k,v)-> System.out.println(k + " : " + v));
        //myMap.entrySet().forEach(k -> System.out.println(k));

        /*
        Consumer<String> consumer = t -> System.out.println(t);
        for (String t: list) {
            consumer.accept(t);
        }
         */
    }
}
