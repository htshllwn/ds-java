package com.cynix.ds;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        System.out.println("Before Sorting: ");
        print(intArray);

        quickSort(intArray, 0, intArray.length);

        System.out.println("After Sorting: ");
        print(intArray);

    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            while(i < j && input[--j] >= pivot);
            if (i < j)  {
                input[i] = input[j];
            }

            while(i < j && input[++i] <= pivot);
            if (i < j)  {
                input[j] = input[i];
            }

            input[j] = pivot;
            return j;

        }
        return i;
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
