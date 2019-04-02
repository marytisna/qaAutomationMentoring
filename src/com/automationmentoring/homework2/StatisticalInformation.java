package com.automationmentoring.homework2;

public class StatisticalInformation {
    public static void main(String[] args) {
        int[] data = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229, 30};
        int sum = 0;
        int median = 0;
        double mean = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        mean = sum/data.length;
        System.out.println("arithmetic mean of an array is " + mean);

        int tmp = 0;
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
            median = (data[data.length/2] + data[data.length/2 - 1])/2;
        }
        else {
            median = data[data.length / 2];
        }
        System.out.println("median of an array is " + median);

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
        System.out.println("mode of an array is " + maxValue);

        double stDev = 0;
        double sum1 = 0;
        for(int i =0; i<data.length; i++){
            double diff = data[i] - mean;
            double square = Math.pow(diff,2);
            sum1 += square;
        }
        stDev = Math.sqrt(sum1/(data.length-1));
        System.out.println("standard deviation of an array is " + stDev);
    }
}
