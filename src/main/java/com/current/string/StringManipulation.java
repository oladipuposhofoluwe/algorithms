package com.current.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringManipulation {

    public static String largestAndSmallestWord(String str){
        if (str.length() == 0) return "";
        if (str.length() == 1) return str;

        int maxlength=Integer.MIN_VALUE;
        int minlength=Integer.MAX_VALUE;

        String lowest = "";
        String longest = "";

        String[] stringsArr = str.split(" ");
        for (int i = 0; i < stringsArr.length; i++){
            if (stringsArr[i].length() < minlength){
                lowest = stringsArr[i];
                minlength = stringsArr[i].length();
            }else if(stringsArr[i].length() > maxlength) {
                longest = stringsArr[i];
                maxlength = stringsArr[i].length();
            }
        }
        return lowest + " "+ longest;
    }

    public static char firstNonRepeatedCharacter(String str){
        if (str.length() == 1) return str.charAt(0);
        //Map<Character, Integer> map = new HashMap<Character, Integer>();

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i =0; i < str.length(); i++){
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1); //O(n)
            }else {
                map.put(str.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> m : map.entrySet()){  //O(n)
            if (m.getValue() == 1){
                return m.getKey();
            }
        }
        return 0;
    }

    public static int numberOfElement(int[] arr){
        if (arr.length == 0) return 0;
        if (arr.length == 1) return 1;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        //System.out.println(largestAndSmallestWord("We belong"));
        //System.out.println(firstNonRepeatedCharacter("Hi this is Marry"));
        System.out.println(numberOfElement(new int []{1,2,3,4,5}));

    }
}
