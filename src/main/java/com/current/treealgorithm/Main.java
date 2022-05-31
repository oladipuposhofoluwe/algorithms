package com.algorithm.treealgorithm;

public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("drinks");
        TreeNode hotDrink = new TreeNode("hotDrink");
        TreeNode coldDrink = new TreeNode("coldDrink");
        TreeNode tea = new TreeNode("tea");
        TreeNode coffee = new TreeNode("coffee");
        TreeNode wine = new TreeNode("wine");
        TreeNode beer = new TreeNode("beer");
        drinks.addChild(hotDrink);
        drinks.addChild(coldDrink);
        hotDrink.addChild(tea);
        hotDrink.addChild(coffee);
        coldDrink.addChild(wine);
        coldDrink.addChild(beer);
        System.out.println(drinks.print(0));
    }
}
