package com.volkodav4ik;

import java.util.Arrays;
import java.util.Random;

/*2.Написать метод.
        Входящий параметр:отсортированный массив типа int который содержит отрицательные и положительные значения.
        Вернуть отсортированный массив который состоит из квадратов значений.
        Не использовать при этом стандартный метод sort.

        Пример:
        Input:[-4,-1,0,3,10]
        Output:[0,1,9,16,100]*/

public class HW3T2 {
    private static final Random RANDOM = new Random();
    private static final int ARR_SIZE = 10;
    private static final int MAX_RANGE = 20;
    private static final int FOR_NEGATIVE_BOUND = MAX_RANGE / 2;

    public static void main(String[] args) {
        int[] input = new int[ARR_SIZE];
        createAndInitArray(input);
        insertionSort(input);
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Output: " + Arrays.toString(squareArray(input)));
    }

    private static int[] squareArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int tmp = input[i] * input[i];
            input[i] = tmp;
        }
        insertionSort(input);
        return input;
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            while ((j > -1) && (arr[j] > tmp)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp;
        }
    }

    private static void createAndInitArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(MAX_RANGE) - FOR_NEGATIVE_BOUND;
        }
    }
}
