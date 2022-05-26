package com.algorithm.methodoverriden;
import com.algorithm.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Play {

    static List<String> myList = null;

    static {
        myList = new ArrayList<String>();
        myList.add("okay");
        myList.add("omg");
        myList.add("kk");
    }

    public static void main(String[] args) {
        //System.out.println(negSubstring("+2347035140205"));
        //System.out.println(newString("+2348067644805"));
        //System.out.println(sum(new int[]{3,2,1}, 3));
        //recursiveMethod(4);
        //System.out.println(fibonacciNumber(-1));
        //System.out.println(sumOfDigit(8));
        //System.out.println(powerOfNumber(3, 4));

//            System.out.println("Converting the given Strings from Lower case to Upper case by using map");
//               myList.stream().map(String::toUpperCase).forEach(System.out::println);
//
//            System.out.println("filter which is starting with 'o' by using filter");
//            myList.stream().filter(s -> s.startsWith("o")).map(x -> x.toUpperCase(Locale.ROOT)).forEach(System.out::println);

        /*
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13);
        List<Integer> primes1 = Arrays.asList(13, 3, 5, 7, 5, 2);
        Integer[] arr = new Integer[]{13, 3, 5, 7, 5, 2};
        int primeGreaterThanFive = Arrays.stream(arr)
                .peek(num -> System.out.println("will filter " + num))
                .filter(x -> x > 5)
                .findFirst()
                .get();
                System.out.println(primeGreaterThanFive);

         */

        List<Employee> peoples = new ArrayList<>();
        peoples.add(new Employee(101, "Victor", 23));
        peoples.add(new Employee(102, "Rick", 21));
        peoples.add(new Employee(103, "Sam", 25));
        peoples.add(new Employee(104, "John", 27));
        peoples.add(new Employee(105, "Grover", 23));
        peoples.add(new Employee(106, "Adam", 22));
        peoples.add(new Employee(107, "Samy", 224));
        peoples.add(new Employee(108, "Duke", 29));

        double average = calculateAverage(peoples);
        //System.out.println("Average age of employees are (classic way) : " + average);

        //average(peoples);
        //System.out.println("Average age of employees are (lambda way) : " + average);

        //System.out.println("MAP alone");
        //peoples.stream().map(p -> p.getAge()).collect(Collectors.toList()).forEach(System.out::println);

//        System.out.println();
//        System.out.println("FILTER alone");
//        peoples.stream().filter(p -> p.getAge()>30).forEach(System.out::println);
//
//        System.out.println();
//        System.out.println("FILTER THEN MAP alone");
//        peoples.stream().filter(p -> p.getAge()<30).map(p -> p.getAge()).forEach(System.out::println);
//
//        System.out.println();
//        System.out.println("MAP THEN FILTER alone");
//        peoples.stream().map(p -> p.getAge()).filter(p -> p > 30).forEach(System.out::println);
//

        Stream<String> s = Stream.of("Geeks",
                "for",
                "GeeksforGeeks",
                "Geeks Classes");

        List<String> myList = s.collect(Collectors.toList());

        List<String> sl = new ArrayList<String>();
        sl.add("Geeks");
        sl.add("for");
        sl.add("GeeksforGeeks");
        sl.add("Geeks Classes");
        // using Collectors toList() function
        List<String> myList1 = sl.stream().collect(Collectors.toList());

        // printing the elements
        //System.out.println(myList);
        //System.out.println();
        //System.out.println(myList1);


        Stream<Employee> employeeStream = Stream.of(
                new Employee(1, "A", 100),
                new Employee(2, "B", 200),
                new Employee(3, "C", 300),
                new Employee(4, "D", 400),
                new Employee(5, "E", 500),
                new Employee(6, "F", 600));
       List<Integer> newList = employeeStream
                .filter(e -> e.getAge() < 400)
                .map(e -> e.getAge())
                .collect(Collectors.toList());
        System.out.println(newList);

        System.out.println(hex2decimal("abc"));



    }
    private static String negSubstring(String str){
        int count = 0;
        String result = "";
        for (int i = 0; i <= str.length() ; i++) {
            if (count > 10 ) break;
            result.concat(String.valueOf(str.charAt(str.length() - i)));
        }
        return   new StringBuilder(result).reverse().toString();
    }


    private String getLast10Digits(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= str.length() ; i++) {
            if (result.length() == 10 ) break;
            int index = str.length() - 1 - i;
            result.append(str.charAt(index));
        }
        return   result.reverse().toString();
    }


    private static String newString(String phoneNumber){
        if(phoneNumber.startsWith("+234")){
            phoneNumber = phoneNumber.replace("+234", "");
        }else if(phoneNumber.startsWith("0"))
            phoneNumber = phoneNumber.replace("0", "");
        return phoneNumber;
    }

    private  String last10Digits(String str){
        return str.startsWith("+") ? str.replace("+234", "") : str.startsWith("234") ? str.replace("234", "") : str.substring(1);
    }

    private static int sum(int[] A, int n){
        int s = 0;
        if (n == 1){
            return A[0];
        }
        System.out.println(s);
        System.out.println("i am here");
        System.out.println(n);
        s = sum(A, n-1);
        System.out.println(s);
        s = s + A[n - 1];
        return s;
    }

    static void recursiveMethod(int n){
        if (n < 1){
            System.out.println("n is less than 1");
        }else {
            recursiveMethod(n-1);
            System.out.println(n);
        }
    }

    static int fibonacciNumber(int n){
        if (n < 0) return -1;
        if (n==0 || n==1){
            return n;
        }
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }

    static int sumOfDigit(int n){
        if (n == 0 || n < 0) return 0;
        return n%10 + sumOfDigit(n/10);
    }
    static int powerOfNumber(int base, int exp){
        if (exp == -1){
            return -1;
        }
        if (exp == 0){
            return 1;
        }
        return base * powerOfNumber(base, exp-1);
    }


    private static double calculateAverage(List<? extends Employee> employees){
        int totalEmployee = employees.size();
        double sum = 0;
        for(Employee e : employees){
            sum += e.getAge();
        }
        return sum/totalEmployee;
    }

    public static int hex2decimal(String s) {
        String digits = "0123456789ABCDEF";
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println();
        System.out.println(s);
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }





}
