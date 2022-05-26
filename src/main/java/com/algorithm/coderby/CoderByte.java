package com.algorithm.coderby;

import java.util.Arrays;

public class CoderByte {
    //Have the function MinWindowSubstring(strArr) take the array of strings
    // stored in strArr, which will contain only two strings, the first
    // parameter being the string N and the second parameter being
    // a string K of some characters, and your goal is to
    // determine the smallest substring of N that contains
    // all the characters in K. For example: if strArr is
    // ["aaabaaddae", "aed"] then the smallest substring of N
    // that contains the characters a, e, and d is "dae"
    // located at the end of the string. So for this example your
    // program should return the string dae.
        public static String MinWindowSubstring(String[] strArr){
            String firstIndex = strArr[0];
            for(int i=0; i<strArr[0].length()-1; i++){
                for(int j=i; j<strArr[0].length(); j++){
                    String orig = strArr[0].substring(i,j+1);
                    StringBuilder str = new StringBuilder(orig);
                    StringBuilder src = new StringBuilder(strArr[1]);
                    for(int k=0; k<strArr[1].length(); k++){
                        int pos = str.indexOf(Character.toString(strArr[1].charAt(k)));
                        if(pos == -1) {
                            break;
                        }

                        else {
                            str.setCharAt(pos, '0');
                            src.deleteCharAt(0);
                        }
                    }
                    if(src.length() == 0){
                        if(orig.length() < firstIndex.length()){
                            firstIndex = orig;
                        }
                    }
                }
            }
            return firstIndex;
        }

        public static String MinWindowSubstring2(String[] strArr){
            String shortest = strArr[0];

            for (int i = 0; i < strArr[0].length() -1; i++){
                for (int j = i; j < strArr[0].length(); j++ ){
                    String sub = strArr[0].substring(i, j+1);
                    StringBuilder builder = new StringBuilder(sub);
                    StringBuilder src = new StringBuilder(strArr[1]);

                    for (int k = 0; k < strArr[1].length(); k++){
                        int pos = builder.indexOf(Character.toString(strArr[1].charAt(k)));
                        if (pos == -1){
                            break;
                        }else {
                            builder.setCharAt(pos, '0');
                            src.deleteCharAt(0);
                        }
                    } if (src.length() == 0){
                        if (sub.length() < shortest.length()){
                            shortest = sub;
                        }
                    }
                }
            }
            return shortest;
        }


    public static String MinWindowSubstring4(String[] strArr) {
            String X = strArr[0];
            String Y = strArr[1];
            String rst = "";
            int mini = Integer.MAX_VALUE;
            for (int i = 0; i < X.length(); i++){
            StringBuilder match = new StringBuilder(Y);
                for (int j = 0; j < X.length(); j++){
                    if (match.toString().contains(String.valueOf(X.charAt(j)))){
                        int index = match.indexOf(String.valueOf(X.charAt(j)));
                        match.replace(index, index+1, "");
                    }
                if (match.length() == 0){
                    if (j - i < mini){
                        mini = j - i;
                        rst = X.substring(i, j+1);
                        }
                    }
                }
                return rst;

            }

        String N = strArr[0];
        String K = strArr[1];
        int min = Integer.MAX_VALUE;
        String result = "";
        for (int i = 0; i < N.length(); i++) {
            StringBuilder match = new StringBuilder(K);
            for (int j=i; j < N.length(); j++) {
                if (match.toString().contains(String.valueOf(N.charAt(j)))) {
                    int index = match.indexOf(String.valueOf(N.charAt(j)));
                    match.replace(index, index + 1, "");
                    System.out.println("JAY " + j);
                    System.out.println("MATCH " + match);
                    //"aaffaksfajeeubsne", "jefaa"
                }

                if (match.length() == 0) {
                    if (j - i < min) {
                        min = j - i;
                        System.out.println(j + " I J " + i);
                        System.out.println( " MIN " + min);
                        result = N.substring(i, j+1);
                        System.out.println("RESULT " + result);
                    }
                    break;
                }
            }
        }
        return result;
    }

    //Have the function BracketMatcher(str) take the str parameter being passed and return 1
    // if the brackets are correctly matched and each one is accounted for.
    // Otherwise return 0. For example: if str is "(hello (world))",
    // then the output should be 1, but if str is "((hello (world))"
    // the the output should be 0 because the brackets do not correctly
    // match up. Only "(" and ")" will be used as brackets. If str contains no brackets return 1.

    public static int BracketMatcher(String str) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    sum++;
                }
                if (str.charAt(i) == ')') {
                    sum--;
                }
            }

                if (sum == 0){
                    return 1;
                }
            return 0;
    }

    //Have the function FindIntersection(strArr) read the array
    // of strings stored in strArr which will contain 2 elements:
    // the first element will represent a list of comma-separated
    // numbers sorted in ascending order, the second element will
    // represent a second list of comma-separated numbers (also sorted).
    //Your goal is to return a comma-separated string containing
    // the numbers that occur in elements of strArr in sorted order.
    // If there is no intersection, return the string false.

    public static String FindIntersection(String[] strArr) {
        String[] arr1 = strArr[0].split(", ");
        String[] arr2 = strArr[1].split(", ");

        String result = "";
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if (Integer.parseInt(arr1[i].trim()) == Integer.parseInt(arr2[j].trim())){
                    result = result+arr1[i].trim()+", ";
                    break;
                }
            }
        }
        if(!result.equals("")){
            result=result.substring(0,result.length()-1);
        }else{
            result="false";
        }

        return result;
    }
    //Have the function QuestionsMarks(str) take the str string parameter,
    // which will contain single digit numbers, letters, and question marks,
    // and check if there are exactly 3 question marks between every pair of two
    // numbers that add up to 10. If so, then your program should return the string
    // true, otherwise it should return the string false. If there aren't any two
    // numbers that add up to 10 in the string, then your program should return
    // false as well.

    public static boolean QuestionsMarks2(String str) {
       int countQuestionMark = 0;
       Integer val1=0;
       Integer val2=0;
       boolean addUpToTen = false;

       for (int i = 0; i < str.length(); i++){
           if (Character.isDigit(str.charAt(i))){
               val1 = Character.getNumericValue(str.charAt(i));
               for (int j = i + 1; j < str.length(); j++){
                   if (Character.isDigit(str.charAt(j))){
                       val2 = Character.getNumericValue(str.charAt(j));
                       if (val1 + val2 == 10 ){
                           addUpToTen = true;
                           if (countQuestionMark != 3){
                               return false;
                           }
                       }
                       break;
                   }else if (str.charAt(j) == '?'){
                       countQuestionMark++;
                   }
               }
           }
       }
       if (!addUpToTen)return false;
           return true;
    }

        public static boolean QuestionsMarks(String str) {
        int questionMarkCount;
        Integer value1;
        Integer value2;
        boolean addsUpToTen = false;
        for(int i = 0; i < str.length(); i++) {
            questionMarkCount = 0;
            if(Character.isDigit(str.charAt(i))) {
                value1 = Character.getNumericValue(str.charAt(i));
                for(int j = i+1; j < str.length(); j++) {
                    if(Character.isDigit(str.charAt(j))) {
                        value2 = Character.getNumericValue(str.charAt(j));
                        if(value1 + value2 == 10) {
                            addsUpToTen = true;
                            if(questionMarkCount != 3) {
                                return false;
                            }
                            System.out.println("BREAK");
                            break;
                        }
                    }
                    else if(str.charAt(j) == '?') {
                        questionMarkCount += 1;
                    }
                }
            }
            System.out.println(i +" " + str.charAt(i)+ " PRINT I");
        }
        if(!addsUpToTen) {
            return false;
        }
        else {
            return true;
        }
    }

    //Have the function LongestWord(sen) take the sen parameter
    // being passed and return the longest word in the string.
    // If there are two or more words that are the same length,
    // return the first word from the string with that length.
    // Ignore punctuation and assume sen will not be empty.
    // Words may also contain numbers, for example "Hello world123 567"

    public static String LongestWord(String sen) {
        String[] words = sen.replaceAll("[^A-Za-z0-9\s]", "").trim().split(" ");
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (longestWord.length() < words[i].length())
                longestWord = words[i];
        }
        return longestWord;
    }


    public static void productExceptSelf(int[] nums) {
        if(nums.length == 0){
        }
        int product =1;
        int[] answer = new int [nums.length];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j< nums.length; j++){
                if (i != j ){
                    product = product * nums[j];
                }
            }
            answer[i] = product;
        }
            Arrays.stream(answer).forEach(System.out::println);
        System.out.println(answer);
        }

    //You are given an array of integers nums, there is a sliding window of
    // size k which is moving from the very left of the array to the very right.
    // You can only see the k numbers in the window.
    // Each time the sliding window moves right by one position.
    //Return the max sliding window.
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) return new int[0];
        int [] output = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            //1,3,-1,-3,5,3,6,7
            for(int j = i; j < i + k; j++){
                System.out.println( "I " + i);
                System.out.println( "JAY " + j);
                max = Math.max(max, nums[j]);
                System.out.println("NUM J " + nums[j]);
            }
            output[i] = max;
        }
        return output;
    }

    //Given an integer array nums, find the contiguous subarray (containing at least one number)
    //which has the largest sum and return its sum.
    //A subarray is a contiguous part of an array.
    public static int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++) {
            currentMax= Math.max(nums[i], nums[0] + nums[i]);
            if(currentMax > max) {
            System.out.println("i " + i);
                max = currentMax;
            }
        }
        return max;
    }

    public static int maxProduct(int[] nums) {
        int result = nums[0];
        for(int i = 0; i < nums.length; i++){
            int product = 1;
            for(int j = i; j < nums.length; j++){
                System.out.println( " i " + i + " PRODUCT " +  product);
                product *= nums[j];
                result = Math.max(result, product);
            }
        }
        return result;
    }
    //There is an integer array nums sorted in ascending order (with distinct values).
    //Prior to being passed to your function, nums is possibly rotated at an unknown
    // pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k],
    // nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
    // For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
    //Given the array nums after the possible rotation and an integer target,
    // return the index of target if it is in nums, or -1 if it is not in nums.
    //You must write an algorithm with O(log n) runtime complexity.

    //approach 1 with rotation
    public static int search(int[] nums, int target) {
        // Special case
        if(nums == null || nums.length == 0){
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] > nums[right]) {
                left = middle + 1;
            }
            else {
                right = middle;
            }
        }
        int pivot = left;
        left = 0;
        right = nums.length - 1;
        if(target >= nums[pivot] && target <= nums[right]){
            left=pivot;
        }else{
            right = pivot;
        }
        while(left <= right){
            int middle = left + (right - left)/2;
            if(nums[middle] == target){
                return middle;
            } else if(target < nums[middle]){
                right = middle - 1;
            } else{
                left = middle + 1;
            }
        }
        return -1;
    }

    //approach 1 with NO rotation
    public static int search2(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return -1;
        }

        int firstIndex = 0;
        int lastIndex = nums.length - 1;

        while (firstIndex <= lastIndex){
            int middleIndex = (firstIndex + lastIndex)/2;

            if (target == nums[middleIndex]){
                return middleIndex;
            }
            if (nums[firstIndex] <= nums[middleIndex]){
                if (target>= nums[firstIndex] && target < nums[middleIndex]){
                    lastIndex = middleIndex -1;
                } else {
                    firstIndex = middleIndex + 1;
                }
            }

            if (nums[middleIndex] <= nums[lastIndex]){
                if (target > nums[middleIndex] && target <= nums[lastIndex]){
                    firstIndex = middleIndex + 1;
                }else {
                    lastIndex = middleIndex - 1;
                }
            }
        }
        return -1;
    }
    //Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
   // For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 1; i < 33; i++){
            if(getBit(n, i)){
                count++;
            }
        }
        return  count;
    }

    public static boolean getBit(int n, int i){
        return (n & (1 << i)) != 0;
    }

    //Given an array nums containing n distinct numbers in the range [0, n],
    // return the only number in the range that is missing from the array.
    public static int missingNumber(int[] nums) {
        System.out.println("THIS ");
        int sum = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            sum+= nums[i];
        }
        int arrSum = ((n + 1) * n)/2;
        if (arrSum == sum) return 0;
        return arrSum - sum;
    }


    public static void main(String[] args) {
        //System.out.println(MinWindowSubstring(new String[]{"aabdccdbcacd", "aad"}));
        //System.out.println(MinWindowSubstring4(new String[]{"aabdccdbcacd", "aad"}));
        //System.out.println(BracketMatcher("(c(oder)) b(yte)"));
        //System.out.println(FindIntersection(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}));
        //System.out.println(QuestionsMarks2("acc?7??sss?3rr1??????5"));
        //System.out.println(LongestWord("I love dogs"));
        //productExceptSelf(new int[]{1,2,3,4});
        //System.out.println(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
        //System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        //System.out.println(maxProduct(new int[]{2,3,-2,4}));
        //System.out.println(search2(new int[]{4,5,6,7,8,0,1,2 }, 2));
        //System.out.println(hammingWeight(00000000000000000000000000001011));
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));

        //[4,5,6,7,0,1,2], target = 0

//            int i=10;
//        System.out.println("INITIAL  " + i);
//        while(i>1){
//                System.out.println(i);
//               // i--;
//                System.out.println("NEW VALUE " + i);
//            }
        }

}
