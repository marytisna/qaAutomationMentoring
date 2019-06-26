package com.automationmentoring.homework6.RLEDataCompressor;

public class App {
    public static void main(String[] args) {
        String str = "AAAAaaaBBBBBB\\12";
        String str2 = "AaaaBB2";
        String str3 = "AaaaBB\\\\2";

        System.out.println(RunLengthEncoding.encode(str));
        System.out.println(RunLengthEncoding.encode(str2));
        System.out.println(RunLengthEncoding.encode(str3));

        String str4 = "4A3a6B\\\\\\1\\2";
        String wrongString = "4A3a6B\\\\1\\2";
        System.out.println(RunLengthEncoding.decode(str4));
        System.out.println(RunLengthEncoding.decode(wrongString));
    }
}
