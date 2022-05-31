package com.algorithm.algorithm2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapClass2 {
    public static void main(String[] args) {
        Map<String, Integer> map =  new HashMap<>();
        map.put("David", 24);
        map.put("John", 35);
        map.put("Jane", 19);
        map.put("Billy", 21);




//        for (Map.Entry<String, Integer> entrySet : map.entrySet() ) {
//            System.out.println(String.format("The Key {name} is %s - while the - value (age) is : %d", entrySet.getKey(), entrySet.getValue()));
//        }

        //map.forEach((key, value) -> System.out.println(key +" : "+ value));
        //map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        for (String key: map.keySet()   ) {
            System.out.println(key);
        }

        for (Integer value: map.values()   ) {
            System.out.println(value);
        }


        List<String> arr = Arrays.asList("1", "2", "3", "4", "5", "6");
       var  even = arr.stream().map(x -> Integer.valueOf(x)).filter(y -> y%2 == 0).collect(Collectors.toList());
        System.out.println(even);

    }

    public <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}

