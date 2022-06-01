package com.current.twodimensionalarry;

public class TwoDimensionalArray {
    int [][] arr;

    public TwoDimensionalArray(int numberOfRows, int numberOfColumn) {
        this.arr = new int[numberOfRows][numberOfColumn];
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr.length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }


    //insert an element into 2 dimensional array
    public void insertElement(int row, int col, int valueToInsert){
        try {
            if (arr[row][col] == Integer.MIN_VALUE){// ----------------------------------O(1)
                arr[row][col] = valueToInsert; // ----------------------------------O(1)
                System.out.println("Value successfully inserted"); // ----------------------------------O(1)
            } else  {
                System.out.println("The cell is already occupied"); // ----------------------------------O(1)
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index f0r 2D Array"); // ----------------------------------O(1)
            // TIME COMPLEXITY ----------------------------------O(1)
            // SPACE COMPLEXITY ----------------------------------O(1)

        }

        }

    //Accessing the cell value from a given array
    public void accessCell(int row, int col){
        System.out.print("\nAccessing Row# " + row + ", Col# " + col + ": "); // ----------------------------------O(1)
        try {
            System.out.println("The cell value is: " + arr[row][col]); // ----------------------------------O(1)
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2DArray"); // ----------------------------------O(1)
        }

    }

    //Traversing through an Array
    public void traverseArray(){
            for (int row = 0; row < arr.length; row++){
                for (int col = 0; col < arr.length; col++){
                    System.out.print(arr[col][col] + " ");
                }
                System.out.println();
            }
         }

     //Write a function that accepts two square (NxN) matrices (two dimensional arrays),
    // and returns the product of the two. Only square matrices will be given.

         public int[][] multiplyMatrix(int a [][], int b[][]){

                int[][] resultMatrix = new int[a.length][b[0].length];

            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < b[0].length; j++ ){
                    for (int k = 0; k < b.length; k++) {
                        resultMatrix[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return resultMatrix;

         }
         
         
         public void lup(){
            for (int i = 0; i <=4; i++){
                System.out.println("for when i = "+ i);
                System.out.println();
                for (int j = 1; j <=4; j++){
                    System.out.print( j + " ");
                }
                System.out.println();
            }
         }




}
