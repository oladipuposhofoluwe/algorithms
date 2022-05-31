package com.algorithm.algorithm;

 class calc{
    int num1;
    int num2;

    public calc() {
        num1 = 5;
        num2 = 3;
        System.out.println("in constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Algorithm algo = new Algorithm();


        for (int i = 0; i < 8; i++){
            for (int j = 1; j < i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
       }


    calc newCalc = new calc();

    }
}
