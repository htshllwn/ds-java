package com.cynix.ds;

public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        System.out.println("Before Sorting: ");
        print(intArray);

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
            lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i+1);
                }
            }
        }

        System.out.println("After Sorting: ");
        print(intArray);

    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void print(int[] array) {
//        System.out.println();
        System.out.print("[ ");
        for(int i = 0; i < array.length; i++) {
//            System.out.print("arr[" + i + "] : " + array[i]);
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
        System.out.println();
    }
}
