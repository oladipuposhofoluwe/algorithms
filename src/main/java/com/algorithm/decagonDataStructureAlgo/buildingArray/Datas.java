package com.algorithm.decagonDataStructureAlgo.buildingArray;

public class Data {
    private int value;
    private String item;

    public Data(int value, String item) {
        this.value = value;
        this.item = item;
    }

    public Data() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
