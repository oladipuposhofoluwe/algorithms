package com.algorithm.stringAlgo;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static String compressString(String str){
        //String str = "a aabbbbccccca";
        char[] chars = str.toCharArray();
        char currentChar = str.length()> 0? chars[0] : ' ';
        char prevChar = ' ';
        int count = 1;
        StringBuilder builder = new StringBuilder();

        if (str.length() > 0){
            for (int i = 1; i < chars.length; i++){

                //String str = "a  a abbbbccccca";
                if (currentChar == chars[i]){
                    count++;
                }else {
                    builder.append(currentChar+""+count);
                    prevChar = currentChar;
                    currentChar = chars[i];
                    count = 1;
                }
            }
        }
        if(str.length() > 0 && prevChar != currentChar)
            builder.append(currentChar + "" + count);
        return builder.toString();
    }

    public static String replace(String str) {
        String[] words = str.split(" ");
        StringBuilder sentence = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            sentence.append("%20");
            sentence.append(words[i]);
        }
        return sentence.toString();
    }

    public static String replaceString(String str) {
            if (str.length()==0) return "";
            if (str.length() == 1) return str;

            String n="";
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)==' '){
                    n=n+"%20";
                } else{
                    n=n+str.charAt(i);
                }
            }
            return n;
    }

    public static String removeDuplicateFromString(String str) {
        if (str.length()==0) return "";
        if (str.length() == 1) return str;

        String n="";
        //AB  B CCCCCBBAB
        char currentIndex = str.charAt(0);
        if (str != null) {
            for (int i = 1; i < str.length(); i++) {
                if (currentIndex != str.charAt(i)) {
                    n = n+currentIndex;
                    currentIndex=str.charAt(i);
                }
            }
            n=n+currentIndex;
        }
        return n;
    }

    private static int countNumberOfOccurrence(String str, char a){
        if (a == ' '){
            return 0;
        }
        int count = 0;
        for (int i =0; i < str.length(); i++){
            if (str.charAt(i) == a){
                count++;
            }
        }
        return count;
    }

    private static String removeCharactersOfSecondStringFromTheFirstString(String first, String second){

        if (second.length()== 0 && first.length() > 0){
            return first;
        }
        if (first.length()== 0 && second.length() > 0){
            return second;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < first.length(); i++){
            for (int j = 0; j < second.length(); j++){
                System.out.println("i= " + i+ " j "+ j);
                if (first.charAt(i) != second.charAt(j)){
                    builder.append(first.charAt(i));
                }
            }
        }
        return builder.toString();
    }



    public static void main(String[] args) {
        //System.out.println("FIRST METHOD " + compressString("abbbccccccccc"));
       //compressString2("aaabbbbccccca");
        //System.out.println(replace2("Mr John Smith ", 14));
        //System.out.println(replace("Mr John Smith "));
        System.out.println(replaceString("Mr John Smith "));
        //System.out.println(removeDuplicateFromString("ABBCCCCCBBABA"));
        //System.out.println(countNumberOfOccurrence("Today is Monday", 't'));
        //System.out.println(removeCharactersOfSecondStringFromTheFirstString("TodayisMonday", "iskkkkkkkk"));
    }
}
