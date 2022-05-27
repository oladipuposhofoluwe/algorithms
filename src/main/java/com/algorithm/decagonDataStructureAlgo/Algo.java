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
    //create a function that reverse a string
    public static String reverseString(String str){
        if (str == null || str.length() < 2){
            return str;
        }
        String[] arrStr = str.split(" ");
        StringBuilder build = new StringBuilder();
        for (int i= 0; i < arrStr.length; i++){
            build.append(arrStr[i]).append(" ");
        }
        return build.reverse().toString();
    }
    public static int[] mergeSortArray(int[] arr1, int[] arr2){
        if (arr1.length == 0 && arr2.length != 0) return arr2;
        if (arr2.length == 0 && arr1.length != 0) return arr1;
        if (arr2.length == 0 && arr1.length == 0) return new int[]{};
        int n1 = arr1.length; //----- O(1)
        int n2 = arr2.length; //----- O(1)
        int n3 = n1 + n2; //----- O(1)
        int[] merge = new int[n3];
        for (int i = 0; i < arr1.length; i++){
            merge[i] = arr1[i]; //----- O(a)
        }

        for (int j = 0; j < arr2.length; j++){
            merge[n1 + j] = arr2[j]; //----- O(b)
        }
        Arrays.sort(merge); //----- O(1)

        return merge; //----- O(1)
        //The TIME COMPLEXITY is O(a + b) but if they have the same length, hence the TIME COMPLEXITY
        // is O(n) + O(n) = O(2n) => O(n)
        //SPACE COMPLEXITY is O(n)
    }




    public static void main(String[] args) {

//        String [] array1 = {"a","b","c","x"};
//        String [] array2 = {"z","b","e"};
//        System.out.println(hasPairWithSUm(array1, array2));
        //System.out.println("SUM " + hasPairWithSum(new int []{1,2,4,9}, 8));
        //System.out.println("SUM 2 " + hasPairWithSum2(new int []{1,2,4,9}, 8));
        //System.out.println("SUM 2 " + hasPairWithSum2(new int []{6,4,3,2,1,7}, 9));
        System.out.println(Arrays.toString(mergeSortArray(new int[]{0, 3, 4, 31}, new int[]{4, 6, 30, 7, 5})));
    }
}
