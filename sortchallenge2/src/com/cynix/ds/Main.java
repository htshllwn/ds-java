package com.cynix.ds;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        System.out.println("Before Sorting: ");
        print(intArray);

//        insertionSort(intArray, 1);
        insertionSort(intArray, intArray.length);

        System.out.println("After Sorting: ");
        print(intArray);

    }

// --------------------------------------------------------------

//    My Solution
//    public static void insertionSort(int[] arr, int firstUnsortedIndex) {
//        if (firstUnsortedIndex == arr.length) {
//            return;
//        } else {
//            recInsSort(arr, firstUnsortedIndex, firstUnsortedIndex, arr[firstUnsortedIndex]);
//        }
//    }
//
//    public static void recInsSort(int[] arr, int firstUnsortedIndex, int i, int newElement) {
//        if (firstUnsortedIndex == arr.length) {
//            return;
//        }
//
//        if (i == 0) {
//            arr[i] = newElement;
//            insertionSort(arr, firstUnsortedIndex + 1);
//            return;
//        }
//
//        if (arr[i - 1] > newElement) {
//            arr[i] = arr[i - 1];
//            recInsSort(arr, firstUnsortedIndex, i - 1, newElement);
//            return;
//        } else {
//            arr[i] = newElement;
//            insertionSort(arr, firstUnsortedIndex + 1);
//            return;
//        }
//    }

// ---------------------------------------------------------------

    public static void insertionSort(int[] input, int numItems) {

        if (numItems < 2) {
            return;
        }

        insertionSort(input, numItems - 1);
        int newElement = input[numItems - 1];
        int i;
        for(i = numItems - 1;
            i > 0 && input[i - 1] > newElement;
            i--) {
            input[i] = input[i - 1];
        }
        input[i] = newElement;
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
