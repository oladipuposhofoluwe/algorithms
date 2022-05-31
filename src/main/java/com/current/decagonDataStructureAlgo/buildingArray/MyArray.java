package com.algorithm.decagonDataStructureAlgo.buildingArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyArray {
    private int length = 0;
    private Collection<Datas>datas= new ArrayList<>();

    public MyArray() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Collection<Datas> getDatas() {
        return datas;
    }

    public void setDatas(Collection<Datas> datas) {
        this.datas = datas;
    }

    public void push(String item){
        Datas d = new Datas(this.length, item);
        this.getDatas().add(d);
        this.length++;
    }

    public Datas pop() {
        Datas lastItem = (Datas) this.datas.toArray()[this.length - 1];
        Iterator<Datas> myIt = datas.iterator();
        while (myIt.hasNext()){
            Datas data = myIt.next();
            if (lastItem == data) {
                myIt.remove();
            }
            //datas.removeIf(data -> data == lastItem); alternative
        }
            this.length--;
            return lastItem;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "length=" + length +
                ", datas=" + datas +
                '}';
    }

    public static void main(String[] args) {
        MyArray newArray = new MyArray();
        newArray.push("hi");
        newArray.push("you");
        newArray.push("!");
        System.out.println(newArray.pop());
        System.out.println(newArray.pop());
        System.out.println(newArray.pop());
        System.out.println(newArray);
    }
}
