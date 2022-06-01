package com.current.algorithm2;

import org.apache.commons.lang3.time.DateUtils;

import java.time.Instant;
import java.util.*;

public class HashMapClass {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println("KKK " +  Date.from(Instant.now()));
        System.out.println("@@@@ " + DateUtils.truncate(new Date(), Calendar.DATE));
        //using an iterator
//        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
//        while(itr.hasNext()){
//            //System.out.println(itr.next());
//        }

        /*
        //using for-each loop
        for (Map.Entry<Integer, String>  entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
         */

        /*
        // 3. Java 8 – using `Iterator.forEachRemaining()
        map.entrySet().iterator().forEachRemaining(System.out::println);
         */

        /*
        // 4. Java 8 – using `Stream.forEach()`
        map.entrySet().stream().forEach(System.out::println);
         */

        /*
        // Java 8 – using `Stream.of()` to get `Stream<Object>`
        Stream.of(map.entrySet()).forEach(System.out::println);
         */

        //Using `toString()`
        System.out.println(map.entrySet());

    }


}
