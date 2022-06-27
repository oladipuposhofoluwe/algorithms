package com.current.decagonDataStructureAlgo.linkedlist;

import lombok.Data;

@Data
public class SingleLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public Node createSingleLinkedList(int nodeValue){
        this.head = new Node();
        Node node = new Node(); //creating an object of Node
        node.value = nodeValue; //setting the value of the Node created
        node.nextNode = null; //since it is the only Node, its reference t another Node is null
        this.head = node;  // (head referencing the new Node)the head Node must reference the newly created Node
        this.tail = node;//(tail referencing the new Node) and also the tail must reference the new created Node..
        this.length = 1; //the number of Node currently is 1, being the just created Node.

        return head;
    }

    public void insert(int newValue, int position){
        Node newNode = new Node();
        newNode.value = newValue;
        newNode.nextNode = null;

        if (position < 1){
            System.out.println("position must be >= 1");
        } else if(position == 1){
            newNode.nextNode =head;
            head = newNode;
        }else {
            Node tempNode = new Node();
            tempNode = head;
            for (int i = 1; i < position -1; i++){
                if (tempNode != null){
                    tempNode = tempNode.nextNode;
                }
            }
            if (tempNode != null){
                newNode.nextNode = tempNode.nextNode;
                tempNode.nextNode = newNode;
            } else {
                System.out.println("The previous node is null");
            }
        }
    }


}
