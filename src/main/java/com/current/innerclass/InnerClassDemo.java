package com.current.innerclass;



class Outer{
    static int a;
    public static void show(){
        System.out.println("in show method");
    }

      class Inner{
        public void display(){
            System.out.println("in display method");
        }
    }
}
public class InnerClassDemo {

    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.a = 10;
        Outer.show();

        Outer.Inner inner = outer.new Inner();
        inner.display();

    }
}
