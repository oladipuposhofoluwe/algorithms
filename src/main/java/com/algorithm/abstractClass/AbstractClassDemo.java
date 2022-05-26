package com.algorithm.abstractClass;

import java.io.File;
import java.util.Arrays;

abstract class Human{
    public abstract void eat();// when a method is declared abstract, the class MUST be declared abstract
    public void walk(){ //but when a class is declared abstract, the method does not
                        // necessarily need to be declared abstract but the method must be declared

    }
}


//when a class extends an abstract class, the class must @Override the *abstract method* in the Super Class.
class Man extends Human{

    @Override
    public void eat() {

    }
}

public class AbstractClassDemo {


    public static void main(String[] args) {

        //Human human = new Human();  you can not create an object of an abstract class, you can only extend it

        Human human =new Man(); // you can create the reference of the abstract class and
                                // object of its sub class i.e the class that extend the abstract class
        human.eat();
        human.walk();
        //File existingFile = new File(temDir, "existingFilr.text");


        int [] numArray = {0, 0, 1, 0, 3, 0, 5, 0, 6};
        pushZerosToEnd(numArray, numArray.length);
    }


    static void pushZerosToEnd(int[] arr, int n)
    {
        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        // incremented

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;
        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
        String para = "+2348067644805";
        String para1 = "08067644805";
        System.out.println(removeLastChar(para1));
    }

    private static String removeLastChar(String str) {
        String newString = "";
        if (str != null && str.length() == 14) {
            newString = str.substring(4, 14);
        }else if (str != null && str.length() == 11){
            newString = str.substring(1);
        }
        return newString;
        //String substr2 = s1.substring(5,10); // Starts from 5 and goes to 10

    }
    }
