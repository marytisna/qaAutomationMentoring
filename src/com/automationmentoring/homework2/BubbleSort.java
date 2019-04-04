package com.automationmentoring.homework2;

import java.util.Arrays;
import java.util.Scanner;

import static com.automationmentoring.homework2.SortOrder.ASC;
import static com.automationmentoring.homework2.SortOrder.DESC;


public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter int for array[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array:" + Arrays.toString(arr));
        sort(ASC, arr);
        sort(DESC, arr);
    }

    private static void sort(SortOrder type, int[] arr){
        int tmp;
        if (type == ASC) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        } else if (type == DESC) {
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
}

