package com.algorithm.methodoverriden;

import java.util.ArrayList;
import java.util.List;

class A {
    public void show(){
        System.out.println("in A");
    }
}

class B extends A {
    public void show(){
        System.out.println("in B");
    }

    public void config(){
        System.out.println("in Config");
    }
}

class C extends A{
    public void show(){
        System.out.println("in C");
    }
}


public class OverridenDemo{
    public static void main(String[] args) {
  ;
        A obj2 = new B();
        obj2.show();

        obj2 = new C();
        obj2.show();


    }
}
