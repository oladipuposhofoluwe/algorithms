package com.algorithm.algorithm2;

import java.util.Arrays;
import java.util.Locale;

public class StringAlgo {
    public static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        word = word.toLowerCase(Locale.ROOT);;
        anagram = anagram.toLowerCase(Locale.ROOT);
        System.out.println(word + " " +  anagram);
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = anagram.indexOf(c);
            System.out.println(index);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1);
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

    public static boolean iAnagram2(String word, String anagram){
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromWord, charFromAnagram); }


    public static boolean checkAnagram(String first, String second){
        char[] characters = first.toCharArray();
        StringBuilder sbSecond = new StringBuilder(second);
        for(char ch : characters){
            System.out.println();
            System.out.println(ch);
            int index = sbSecond.indexOf("" + ch);
            if(index != -1){
                sbSecond.deleteCharAt(index);
                System.out.println(sbSecond);
            }else{
                return false;
            }
        }
        return sbSecond.length()==0 ? true : false;
    }

    public static  int recursion(int n){
        if (n == 0){
            return  1;
        }
        var power = 2 * recursion(n - 1);
        return power;
    }



    public static void main(String[] args) {
        //System.out.println(checkAnagram("mary", "army"));
        System.out.println(recursion(2));
        //System.out.println(iAnagram2("rmay", "Mary"));
    }
}


