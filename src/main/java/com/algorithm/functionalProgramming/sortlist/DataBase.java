package com.algorithm.functionalProgramming.sortlist;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Employee> getEmployee(){
        List<Employee> empl = new ArrayList<>();
        empl.add(new Employee(176, "Roshan", "IT", 600000));
        empl.add(new Employee(388, "Bikash", "CIVIL", 900000));
        empl.add(new Employee(470, "Bimal", "DEFENCE", 500000));
        empl.add(new Employee(624, "Sourav", "CORE", 400000));
        empl.add(new Employee(176, "Prakash", "SOCIAL", 1200000));
        return empl;
    }
}
