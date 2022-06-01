package com.current.algorithm2;

import java.util.*;

public class Algorithmm {
    //Java Program to find duplicate characters in String
    public static void findDuplicate(String word){
        char[] characters = word.toCharArray();
        System.out.println("THE WORD " + Arrays.toString(characters));
        Map<Character, Integer> charMap = new HashMap<>();
        System.out.println("THE FIRST CHAPMAN " + charMap);
        for (Character ch: characters) {
            if (charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch) + 1);
            } else{
                charMap.put(ch, 1);
            }
            System.out.println("THE CHAPMAN " + charMap);

        }
        // Iterate through HashMap to print all duplicate characters of String
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.println("THE ENTRYSET " + entrySet);
        System.out.println("THE charmap " + charMap);
        System.out.println("THE charmap entry set " + charMap.entrySet());
        System.out.printf("List of duplicate characters in String '%s' %n", word);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            } }
    }


    public static void main(String[] args) {
        findDuplicate("Programming");
//        findDuplicate("Combination");
//        findDuplicate("Java");

        Map<String, Integer> result1= new HashMap<>();
        Map<String, Integer> result2= new HashMap<>();
        Map<String, Integer> result3= new HashMap<>();
        result1.put("Mar", 2);
        result2.put("Jan", 2);
        result3.put("Mar", 2);

        List<Map<String,Integer>> maps = new ArrayList<Map<String,Integer>>();

        maps.add(result1);
        maps.add(result2);
        maps.add(result3);


        System.out.println( "I DON CALLAM " + addKeys(result1, result2, result3));
    }

    //Adding or merging a list of maps
    public static Map<String, Integer> addKeys(Map<String, Integer>... maps) {
        Set<String> keys = new HashSet<String>();

        for (Map<String, Integer> map : maps){
            keys.addAll(map.keySet());
        }
        System.out.println("KEYS " + keys);

        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String key : keys) {
            Integer value = 0;
            for (Map<String, Integer> map : maps)
                if (map.containsKey(key))
                    value += map.get(key);
            result.put(key, value);
        }

        return result;
    }
    
}
