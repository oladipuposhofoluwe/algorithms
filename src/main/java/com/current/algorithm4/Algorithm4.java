package com.current.algorithm4;

import java.util.Arrays;
import java.util.UUID;

public class Algorithm4 {
/*
    Java program to remove duplicates from this array. You don't
 * need to physically delete duplicate elements, replacing with null, or
 * empty or default value is ok.

 */
    public static int [] removeDuplicate(int [] arrayWithDuplicateNumber){
        Arrays.sort(arrayWithDuplicateNumber);
        int previousNumber = arrayWithDuplicateNumber[0];
        int [] result = new int[arrayWithDuplicateNumber.length];
        result[0] = previousNumber;

        for (int i = 1; i < arrayWithDuplicateNumber.length; i++){
            int ch = arrayWithDuplicateNumber[i];
            if (ch != previousNumber){
                result[i] = ch;
            }
            previousNumber = ch;
        }

        return result;
    }

    public static void highestNumber(int[] arr){
        //Arrays.sort(arr);
        int highest = arr[0];
        int smallest = arr[0];

            for (int number: arr) {
                if (number > highest){
                    highest = number;
                }else if (number < smallest){
                    smallest = number;
                }
            }

        System.out.println("HIGHEST: " + highest);
        System.out.println("SMALLEST: " + smallest);
        String token = UUID.randomUUID().toString();
        System.out.println(token);
    }

    public static void main(String[] args) {
        System.out.println("REMOVE DUPLICATE ARRAY: " + Arrays.toString(removeDuplicate(new int[]{3, 1, 5, 2, 1, 4, 5
        })));

        highestNumber(new int[]{10,2,3,4,5});
    }
}
