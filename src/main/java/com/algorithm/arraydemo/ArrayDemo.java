package com.algorithm.arraydemo;


class Student{
    int id;
    String name;


}
public class ArrayDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        Student student[] = new Student[]{s1, s2, s3, s4};

        int a[] = {1,2,3,4};
        int b[] = {5,6,7,8};
        int c[] = {9,10,11,12};

        int d[][] = {
                        {1,2,3,4},
                        {5,6,8},
                        {9,10,11,12}
                    };

        for (int i = 0; i < d.length; i++){
            for (int j = 0; j < d[i].length; j++){
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enhance for look belowe");

        for (int[] k : d) {
            for (var l : k) {
                System.out.print(" " + l);
            }
            System.out.println();
        }
    }
}
