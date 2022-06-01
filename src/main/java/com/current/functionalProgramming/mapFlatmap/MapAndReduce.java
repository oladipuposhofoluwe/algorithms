package com.current.functionalProgramming.mapFlatmap;

import java.util.*;

public class MapAndReduce {

    public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 9, 5);
    List<String> word = Arrays.asList("corejava", "Spring", "hibernate");

    /*
    int sum =0;
        for (Integer num: numbers  ) {
            sum = sum + num;
        }
        System.out.println(sum);

     */


       int numb =  numbers.stream().mapToInt(i -> i).sum();
       //System.out.println(numb);

        int reduceSum = numbers.stream().reduce(0, Integer::sum);
        //System.out.println(reduceSum);
        int reduceMultiplication = numbers.stream().reduce(1, (a, b) -> a * b);
        //System.out.println(reduceMultiplication);
        Optional<Integer> maxValue = numbers.stream().reduce( (a, b) -> a > b ? a : b);
        System.out.println(maxValue.get());

        String longestString = word.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get().toUpperCase(Locale.ROOT);
        System.out.println(longestString);
}
}
