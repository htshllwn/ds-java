package com.cynix.ds;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        System.out.println("Before Sorting: ");
        print(intArray);

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
            firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex;
                i > 0 && intArray[i - 1] > newElement;
                i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }

        System.out.println("After Sorting: ");
        print(intArray);

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
