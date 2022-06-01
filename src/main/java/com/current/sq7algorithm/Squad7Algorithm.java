package com.current.sq7algorithm;

import java.util.*;

public class Squad7Algorithm {
    //Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
    // such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = getMapWithPos(nums);
        Set<List<Integer>> items = new HashSet<>();
        Set<Integer> hs1 = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hs1.add(nums[i])){
                continue;
            }
            System.out.println("hs1 " + hs1);

            Set<Integer> hs2 = new HashSet<>();
            for (int k = i + 1; k < nums.length; k++) {
                if (!hs2.add(nums[k]))
                    continue;
                int n3 = -nums[i] - nums[k];
                Integer pos = map.get(n3);
                if (pos != null && pos > k) {
                    List<Integer> list = new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(nums[k]);
                    list.add(nums[pos]);
                    Collections.sort(list);
                    items.add(list);
                }
            }
        }
        return new ArrayList<>(items);
    }
    private Map<Integer, Integer> getMapWithPos(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], i);
        }
        System.out.println("MAP " + map);
        return map;
    }


    //You are given an array prices where prices[i] is the price of a given stock on the ith day.
    //You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    //Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    public int maxProfit2(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length-1; i++){
            int buyPrice = prices[i];
            for (int j = i+1; j < prices.length;j++){
                int sellingPrice = prices[j];
                if (sellingPrice > buyPrice){
                    int profit =  sellingPrice - buyPrice;
                    if (profit > maxProfit){
                        maxProfit = profit;
                    }
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Squad7Algorithm algo = new Squad7Algorithm();
        //System.out.println(algo.threeSum(new int[]{-1,0,1,2,-1,-4,}));
        System.out.println(algo.maxProfit2(new int[]{7,6,4,3,1}));


    }
}
