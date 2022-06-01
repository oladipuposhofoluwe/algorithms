package com.current.statickeyword;

class Employee{
    int emplId;
    int emplSalary;
    static String ceo;




    public Employee() {
        emplId = 4;
        emplSalary = 3000;
        System.out.println("in constructor");
    }

    static {
        System.out.println("in static 2");
        ceo = "Tunde2";
    }

    static {
        System.out.println("in static 1");
        ceo = "Tunde1";
    }

    public void show (){
        System.out.println(emplId + " : " + emplSalary + " : " + ceo);
    }
}


public class StaticKeyWord  {

    public static void main(String[] args) {
        Employee dipson = new Employee();
        Employee festus = new Employee();



        dipson.show();
        festus.show();

    }
}
