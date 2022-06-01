package com.current.singledimensionalarray;

public class SingleDimensionalArray {
    int [] arr;

    public SingleDimensionalArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //Inserting an element into an array
    public void insert(int location, int valueToInsert){
        try {
            if (arr[location] == Integer.MIN_VALUE){ //--------------------------O(1)
                arr[location] = valueToInsert; //--------------------------O(1)
                System.out.println("Value successfully inserted"); //--------------------------O(1)
            } else{
                System.out.println("The is cell is already occupied"); //--------------------------O(1)
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array index"); //--------------------------O(1)
        }
        // Time complexity--------------------------O(1) because no time is required
        // Space complexity --------------------------O(1) because no memory allocation is required
    }


    // Traversing an array
    public void traverseArray(){
        try {
            for (int i = 0; i < arr.length; i++){ //--------------------------O(n)
                System.out.print(arr[i] + " ");  //--------------------------O(1)
            }
        } catch (Exception e){
            System.out.println("Array no longer exist"); //--------------------------O(1)
        }
        //Time complexity--------------------------O(n) because it requires time to visit the length of the array
        //Space complexity--------------------------O(1) because no memory allocation is required
    }

    //Searching for an element in a given arra
    public void searchElement(int valueToSearch){
        for (int i = 0; i < arr.length; i++){ //--------------------------O(n)
            if (arr[i] == valueToSearch){ //--------------------------O(1)
                System.out.println("The value " + valueToSearch + " is found at index: " + i); //--------------------------O(1)
                return; //--------------------------O(1)
            }
        }
        System.out.println("The value " + valueToSearch + " is not found"); //--------------------------O(1)
        //Time complexity--------------------------O(n) because it requires time to visit the length of the array
        //Space complexity--------------------------O(1) because no memory allocation is required
    }

    //deleting an element of ana array
    public void deleteElement(int valueToDeleteIndex){
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE; //--------------------------O(1)
            System.out.println("The value has been successfully deleted"); //--------------------------O(1)
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The value provided is not in the range of array"); //--------------------------O(1)
        }
        //Time complexity--------------------------O(1)
        //Space complexity--------------------------O(1) because no memory allocation is required

    }
}
