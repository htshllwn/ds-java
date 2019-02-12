package com.cynix.ds;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 4725, 4586, 1330, 8792, 1594, 5792 };

        System.out.println("Before Sorting: ");
        print(intArray);

        radixSort(intArray, 10, 4);

        System.out.println("After Sorting: ");
        print(intArray);

    }

    public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];
        for (int value: input) {
            countArray[getDigit(position, value, radix)]++;
        }
//        Adjust the countArray
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[
                    getDigit(position, input[tempIndex], radix)
                    ]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
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
