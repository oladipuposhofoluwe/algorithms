package com.algorithm.functionalProgramming;

interface Calculator {
    int subtract(int i1, int i2);
}

class CalculatorImpl{
    public static void main(String[] args) {
        Calculator calculator = (i1, i2) -> {
            if (i2 < i1){
                throw new RuntimeException("message");
            } else {
                return i2 - i1;
            }
        };

        System.out.println(calculator.subtract(12, 8));

    }
}
