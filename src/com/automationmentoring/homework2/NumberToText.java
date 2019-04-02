package com.automationmentoring.homework2;

public class NumberToText {

    public static String convertNumber(int number) {
        String result = "";
        String[] digits = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {" ", " ", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (number > 0 && number < 10) {
            result = digits[number];
            return result;
        } else if (number >= 10 && number < 20) {
            result = teens[number % 10];
            return result;
        } else if (number > 19 && number < 100) {
            result = tens[number / 10] + " " + digits[number % 10];
            return result;
        } else if (number >= 100 && number < 1000) {
            result = digits[(number / 100) % 10] + " hundred" +  " " + convertNumber(number % 100);
            return result;
        } else if(number >=1000 && number <10000) {
            result = digits[(number / 1000) % 10] + " thousand" + " " + convertNumber(number%1000);
            return result;
        } else if(number == 10000){
            result = teens[(number / 1000) % 10] + " thousand";
        }

        return result;
    }
    public static void main(String[] args) {
        for(int i = 10; i<=150; i++)
            System.out.println(convertNumber(i));
        for(int i = 9980; i<=10000; i++)
            System.out.println(convertNumber(i));

    }
}
