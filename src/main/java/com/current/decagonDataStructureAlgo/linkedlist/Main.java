package com.current.decagonDataStructureAlgo.linkedlist;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList SLL = new SingleLinkedList();
        //SLL.createSingleLinkedList(10);
        SLL.createSingleLinkedList(5);
        SLL.insert(2, 1);
        System.out.println(SLL);
    }
}
