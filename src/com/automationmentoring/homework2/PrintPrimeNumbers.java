package com.automationmentoring.homework2;

public class PrintPrimeNumbers {

     public static void main(String[] args) {
         long from = 0;
         long to = 50000;
            for (long i = from; i <= to; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }

        public static boolean isPrime(long n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

}
