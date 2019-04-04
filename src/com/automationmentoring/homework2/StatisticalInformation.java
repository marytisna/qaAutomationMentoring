package com.automationmentoring.homework2;

public class StatisticalInformation {

    public static void main(String[] args) {
        int[] arr = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229, 30};
        System.out.println("arithmetic mean of an array is " + mean(arr));
        System.out.println("median of an array is " + median(arr));
        System.out.println("mode of an array is " + mode(arr));
        System.out.println("standard deviation of an array is " + stdDev(arr));
    }

    private static double mean(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum / data.length;
    }

    private static int median(int[] data) {
        int tmp;
        for (int i = 0; i < data.length-1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
        if (data.length % 2 == 0) {
            return (data[data.length/2] + data[data.length/2 - 1])/2;
        }
        else {
           return data[data.length / 2];
        }
    }

    private static int mode(int[] data){
        int maxCount = 0;
        int maxValue = 0;
        for(int i = 0; i<data.length; i++) {
            int count = 0;
            for(int j = 0; j<data.length; j++) {
                if(data[i]==data[j]) count++;
            }
            if(count > maxCount){
                maxCount = count;
                maxValue = data[i];
            }
        }
        return maxValue;
    }

    private static double stdDev(int[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            double diff = data[i] - mean(data);
            double square = Math.pow(diff, 2);
            sum += square;
        }
        return Math.sqrt(sum / (data.length - 1));
    }

}
