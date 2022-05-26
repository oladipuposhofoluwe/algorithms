package com.algorithm.singledimensionalarray;

public class Main {
    public static void main(String[] args) {
        SingleDimensionalArray sda = new SingleDimensionalArray(10);
        sda.insert(0,10);
        sda.insert(1,20);
        sda.insert(2,30);


        System.out.println("Array traversal");
        sda.traverseArray();


        System.out.println("Search Array");
        sda.searchElement(40);

        System.out.println("Delete Array");
        sda.deleteElement(0);
        System.out.println(sda.arr[0]);



    }
}
