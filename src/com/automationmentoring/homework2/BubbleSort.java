package com.automationmentoring.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    enum SortOrder {Asc, Desc}
    static void Sort(SortOrder type, int[] arr){
        int tmp = 0;
        if (type == SortOrder.Asc) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        } else if (type == SortOrder.Desc) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }

        System.out.println("Sorted array:" + Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter int for array[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array:" + Arrays.toString(arr));
        Sort(SortOrder.Asc, arr);
        Sort(SortOrder.Desc, arr);
    }
}

