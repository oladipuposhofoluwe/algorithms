package com.current.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);

        // please enter an operator to perform
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // enter first numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        // enter second numbers
        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            // this performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // this performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // this performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // this performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}
