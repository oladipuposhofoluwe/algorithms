package com.current.udemy;

import java.lang.constant.Constable;
import java.util.*;

public class HashTable {
    //given an array, fine the first repeating element in the  array
 public static Constable firstRecurringNumber(int[]arr){
     int min = 0;
     Set<Integer> set = new HashSet<>();

     for (int i=0; i<arr.length; i++){
         if (set.contains(arr[i])){
             min = arr[i]; //space complexity O(n) and time complexity O(1)
             break;
         }else {
             set.add(arr[i]);
         }
     }
     if (min == 0){
        return null;
     }
     //although the algorithm can be solved using nexted for loops, which will eventually result to
     //O(n^2) time complexity with O(1) space complexity...

     //the worst case here for the space complexity is O(n), because if at all
     //it can not find any element, it will have to loop through all the array which will
     //O(n) space complexity
     // But the time complexity is O(1)
     return min;
 }
    public static void main(String[] args) {
        System.out.println(firstRecurringNumber(new int[]{2,5,1,2,3,5,1,2,4}));
        System.out.println(firstRecurringNumber(new int[]{2,1,1,2,3,5,1,2,4}));
        System.out.println(firstRecurringNumber(new int[]{2,1,3,3,5,5,5,2,4}));
        System.out.println(firstRecurringNumber(new int[]{2,3,4,5}));
    }
}
