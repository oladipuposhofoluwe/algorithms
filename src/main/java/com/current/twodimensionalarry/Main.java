package com.current.twodimensionalarry;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        TwoDimensionalArray tda = new TwoDimensionalArray(4,4);
//        tda.insertElement(0,0,10);
//        tda.insertElement(0,1,20);
//        tda.insertElement(0,2,30);

//
        //System.out.println(Arrays.deepToString(tda.arr));

        //tda.accessCell(0,0);

        //tda.traverseArray();
        //System.out.println(Arrays.deepToString(tda.multiplyMatrix(new int[][]{{1, 2}, {3, 4}}, new int[][]{{1, 2}, {3, 4}})));
        //tda.lup();


        int twoByTwoArray [][] = {
                    {1,2,3,4,0},
                    {5,6,7},
                    {9,10,11,12,5,8}
         };

//        for(int i = 0; i< twoByTwoArray.length; i++){
//            for(int j = 0; j< twoByTwoArray[i].length; j++){
//                System.out.print (" " + twoByTwoArray[i][j]);
//            }
//            System.out.println();
//        }

        for (int k[]: twoByTwoArray) {
            for (int j: k) {
                System.out.print(" " + j);
            }
            System.out.println();
        }


        Main main = new Main();
        System.out.println(Arrays.toString(main.as( new int[]{1,2,3,4,5})));

    }



    public int[] as(int sample[]) {
        for (int i = 0; i < sample.length; i++){
            sample[i] = sample[i]*2;
        }
        return sample;
    }




}
