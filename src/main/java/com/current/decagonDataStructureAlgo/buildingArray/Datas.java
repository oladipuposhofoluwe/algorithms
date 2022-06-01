package com.current.decagonDataStructureAlgo.buildingArray;

public class Datas {
    private int value;
    private String item;

    public Datas(int value, String item) {
        this.value = value;
        this.item = item;
    }

    public Datas() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void addItem(int value, String item){
        this.value = value;
        this.item = item;
    }


    @Override
    public String toString() {
        return "Datas{" +
                "value=" + value +
                ", item='" + item + '\'' +
                '}';
    }
}
