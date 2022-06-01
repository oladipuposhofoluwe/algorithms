package com.current.DateUtilll;

import java.util.*;

public class CalculateDate {
    public static void main(String[] args) {

        int[] arr = { 7 };
        System.out.println("NON REPEATED LIST " +  nonRepeated(arr));
    }


    public static int monthsBetween(Date d1, Date d2){
        if(d2==null || d1==null){
            return -1;//Error
        }
        Calendar c=Calendar.getInstance();
        c.setTime(d1);
        int nMonth1=12*c.get(Calendar.YEAR)+c.get(Calendar.MONTH);
        c.setTime(d2);
        int nMonth2=12*c.get(Calendar.YEAR)+c.get(Calendar.MONTH);
        return java.lang.Math.abs(nMonth2-nMonth1);
    }

    //write  a program to generate the non repeating element in an array
    public static List<Integer> nonRepeated(int[] arr){
        //declear the list of non repeated values to return
        List<Integer> non_repeated_list = new ArrayList<>();
        //check for the base cases scienero
        //first case
        if (arr.length == 0){
            return non_repeated_list;
        }
        //second case
        if (arr.length == 1){
             non_repeated_list.add(arr[0]);
             return non_repeated_list;
        }
        //Add each of the value to a map to get there key and value, value represent the number of time each value occurs
    Map<Integer,Integer> mapArray = new HashMap<>();
    for (int i = 0; i < arr.length; i++){
        if (!mapArray.containsKey(arr[i])){
            mapArray.put(arr[i], 1);
        } else{
            mapArray.put(arr[i], arr[i] + 1);
        }
    }
    //add each of the numbers with value of 1 to a list to return
    for (Map.Entry<Integer, Integer> map: mapArray.entrySet()){
        if (map.getValue() == 1){
            non_repeated_list.add(map.getKey());
        }
    }
    return non_repeated_list;
    }

}
