package com.cynix.ds;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };

        System.out.println("Before Sorting: ");
        print(intArray);

        countingSort(intArray, 1, 10);

        System.out.println("After Sorting: ");
        print(intArray);

    }

    public static void countingSort(int[] input, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
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
