package com.current.functionalProgramming.sortmap;

import com.current.functionalProgramming.sortlist.Employee;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {


        //sorting a map...
        Map<String, Integer> map = new HashMap<>();
        map.put("eigth", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

//        List<Map.Entry<String, Integer>> mapList = new ArrayList<>(map.entrySet());
//        System.out.println(mapList);
//
//        System.out.println("**********COMPARE BY KEY*********************"); //ASCENDING ORDER
//        mapList.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//
//        System.out.println("***********COMPARE BY VALUE*****************"); //ASCENDING ORDER
//        mapList.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
//
//        System.out.println("***********COMPARE BY VALUE*****************"); //DESCENDING ORDER
//        Collections.sort(mapList, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
//        System.out.println(mapList);



        Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o1.getDept().compareTo(o2.getDept())));
        employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
        employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
        employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
        employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
        employeeMap.put(new Employee(176, "Prakash", "SOCIAL", 1200000), 120);

        System.out.println("***********SORTING*****************");
        //System.out.println(employeeMap);

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept))).forEach(System.out::println);

    }
}

