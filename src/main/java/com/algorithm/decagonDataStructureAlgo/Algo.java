package com.algorithm.decagonDataStructureAlgo;

import java.util.*;

public class Algo {

    static boolean hasPairWithSUm(String[]array1, String [] array2){
        Map<String, Object> map = new HashMap<>();

        for (int i =0; i < array1.length; i++){
            if (!map.containsKey(array1[i])){
                String item = array1[i];
                map.put(item, true);
            }
        }

        for (int j = 0; j < array2.length; j++){
            if (map.containsKey(array2[j])){
                return true;
            }
        }
        return false;
        //the TIME COMPLEXITY here is O(a+b) since the input arrays do not have the same size
        //if they do have the same size the TIME COMPLEXITY WOULD BE 0(2n)
        //SPACE COMPLEXITY IS O(1)
    }

    private static boolean hasPairWithSum(int[] arr, int sum){
        int arrLength = arr.length;
        for (int i = 0; i < arrLength - 1; i++){
            for (int j =i+1; j < arrLength; j++){
                if (arr[i] + arr[j] == sum){
                    return true;
                }
            }
        }
        return false;
        //the TIME COMPLEXITY here is O(n^2) with SPACE COMPLEXITY of O(1)
    }
    private static boolean hasPairWithSum2(int[] arr, int sum){
        Set<Integer> mapSet = new HashSet<>();
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++){
            int value = arr[i];
                if (mapSet.contains(value)){
                    return true;
                }else {
                    mapSet.add(sum - value);
                }
        }
        return false;
        //the TIME COMPLEXITY here is O(n) with SPACE COMPLEXITY of O(n )

    }



    public static void main(String[] args) {

//        String [] array1 = {"a","b","c","x"};
//        String [] array2 = {"z","b","e"};
//        System.out.println(hasPairWithSUm(array1, array2));
        //System.out.println("SUM " + hasPairWithSum(new int []{1,2,4,9}, 8));
        //System.out.println("SUM 2 " + hasPairWithSum2(new int []{1,2,4,9}, 8));
        System.out.println("SUM 2 " + hasPairWithSum2(new int []{6,4,3,2,1,7}, 9));
    }
}
