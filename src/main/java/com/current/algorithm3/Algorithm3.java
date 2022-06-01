package com.current.algorithm3;

import java.util.Locale;

public class Algorithm3 {
    public static int fibonacciNumbers(int n){
        //0,1,1,2,3,5,8,13,21,34,55,89.....
        if (n==0 || n==1) return n;
        if (n<0) return -1;
        var fib = fibonacciNumbers(n-1) + fibonacciNumbers(n-2);
        return fib;
    }

    //find the sum of digits in a positive integer
    public static int sumOfDigits(int n){
        if (n==0 || n<0) return 0;
        return n%10 + sumOfDigits(n/10);
    }

    //calculate the number of a digit using recursion
    public static int powerOfDigit(int base, int power){
        if (power == 0 || power == 1) {
            return 1;
        }
        if (power < 0) {
            return -1;
        }
        return base * powerOfDigit(base, power - 1);
    }
    //converting a number from decimal to binary
    public static int decimalTobinary(int n){
        if (n == 0 || n == 1){
            return n;
        }
       return n%2 + 10 * decimalTobinary(n/2);
    }

    //write a method to calculate the product of an array
    public static int productArray(int A[], int N){
        if (N == 1)return A[0];
        System.out.println(N);
        return (productArray(A, N-1) * A[N-1]);
    }

    //recursive range
    public static int recursiveRange(int num) {
        if (num<=0) {
            return 0;
        }
        return num + recursiveRange(num - 1);
    }

    //write a function to reverse a string
    //case 1
    public static String reverseString(String word){
        if (word.isEmpty()){
            return word;
        }
        int length = word.length();
        StringBuilder reversedWord = new StringBuilder();
        for (int i=0; i < length; i++){
            reversedWord.append(word.charAt(length - 1 - i));
        }
        return reversedWord.toString();
    }

    //case 2 recursive method
    public static String reverse(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }

    //write a function to check if a strings are palindrome
    public static boolean isPalindrome(String str){
        if (str.length() == 0 || str.length() == 1){
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)){
            return isPalindrome(str.substring(1, str.length()-1));
        }
        return false;

    }

    public static boolean isPalindrome2(String word){
        if (word.length() == 0 || word.length() == 1){
            return true;
        }
        StringBuilder reversedWord = new StringBuilder();
        for (int i=0; i < word.length(); i++){
            reversedWord.append(word.charAt(word.length()- 1 - i));
        }
        if (reversedWord.toString().equals(word) ){
            return true;
        }
        return false;
    }

    //write an algorithm to find the upper case in a string
    public static String findUpperCases(String str){
        if (str.isEmpty()){
            return "";
        }
        if (str.length()==1 && Character.isUpperCase(str.charAt(0))){
            return str;
        }

        String newStr ="";
        for (int i = 0; i < str.length(); i++){
            if (Character.isUpperCase(str.charAt(i))){
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    // write an algorithm to find the first uppercase in a string
    static char firstUpperCase(String str)
    {
        for (int i = 0; i < str.length(); i++)
            if (Character.isUpperCase(str.charAt(i)))
                return str.charAt(i);
        return 0;
    }

    public static String capitalizeWordFirstLetter(String str){
        String words[]=str.split("\\s");
        String capitalizeWord="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            capitalizeWord+=first.toUpperCase(Locale.ROOT)+afterfirst+" ";
        }
        return capitalizeWord.trim();
    }

    //Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
    public static String makeReadable(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, (seconds % 60));

    }

    public static String deleteCapLetter(String str){
        if (str.isEmpty()){
            return "";
        }
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < sb.length(); i++){
            if (Character.isUpperCase(sb.charAt(i))){
                System.out.println(sb.charAt(i));
                int index = str.indexOf(sb.charAt(i));
                sb.deleteCharAt(index);

            }
        }
        return sb.toString();
    }

    //write a function to find the highest number of an array
    public static int highestNum(int[] sample,int n){
        if (n == 1){
            return sample[0];
        }
        return Math.max(sample[n-1], highestNum(sample, n-1));
    }

    //write a function that calculate the sum an product of an Array
    public static void sumAndProductOfArray(int[] sample){
        int sum = 0; //time complexity here is O(1) because it is just an assignment we are making her
        int product = 1; //time complexity here is O(1) because it is just an assignment we are making here

        for (int i = 0; i<sample.length; i++){ // the time complexity is O(n)
            sum += sample[i];                   // the time complexity is O(1)
        }
        for (int i = 0; i<sample.length; i++){ // the time complexity is O(n)
            product*= sample[i];                // the time complexity is O(1)
        }

        System.out.println("{Sum " + sum + ": " + "Product " + product +"}"); // the time complexity is O(1) because printing an element takes O(1)
        //Therefore the time complexity is O(1) time complexity
    }

    //create a function that print the pairs of an array
    public static void printPair(int[] sample){
        for (int i = 0; i < sample.length; i++){ //....... time complexity O(N)
            for (int j = 0; j<sample.length; j++) //....... time complexity O(N)
            System.out.println( sample[i] + ", " + sample[j] ); //....... time complexity O(N)
        }

        //the time complexity is O(N) * O(N) +O(1) = O(N^2). we have to multiply because we it is a nexted for loop i.e at each index of i,
        //we are visiting every index of j

    }

    //create an method which takes in array as parameter and reverse it

    public static int[] reverseArray(int[] arr){
        if (arr.length==1){
            return arr;
        }
        return null;
    }

    public static void main(String[] args) {
        //System.out.println(fibonacciNumbers(3));
        //System.out.println(sumOfDigits(5));
        //System.out.println(powerOfDigit(2, -1));
        //System.out.println(decimalTobinary(13));
        //System.out.println(productArray(new int[]{2,3,5,6}, 4));
        //System.out.println(recursiveRange(5));
        //System.out.println(reverse("man"));
        //System.out.println(reverseString("man"));
        //System.out.println(isPalindrome("sunday"));
        //System.out.println(isPalindrome2("nan"));
        //System.out.println(firstUpperCase("lonDon"));
        //System.out.println(findUpperCases("LonDoN"));
        //System.out.println(capitalizeWordFirstLettelondonr("london"));
        //System.out.println(makeReadable(3600));
        //System.out.println(deleteCapLetter("TTjaatpoin"));
        //System.out.println(highestNum(new int[]{11,4,6,5,7}, 5));
        //sumAndProductOfArray(new int[]{1,3,4,5});
        printPair(new int[]{1,3,4,5});

    }
}
