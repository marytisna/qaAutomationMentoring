package com.automationmentoring.homework6.RLEDataCompressor;

public class RunLengthEncoding {

    public static String encode(String str) {
        String encoding = "";
        int count;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count = 1;
                while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                    i++;
                }
                encoding += String.valueOf(count) + str.charAt(i);
            } else if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '\\')
                encoding += "\\" + str.charAt(i);
        }

        return encoding;
    }

    public static String decode(String str) {
        String decoding = "";
        String count = "";
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '\\') {
                if (str.charAt(i+1) == '\\' || Character.isDigit(str.charAt(i+1))) {
                    decoding += str.charAt(i + 1);
                    i += 2;
                } else throw new RuntimeException("Input string did not pass validation!");
            } else if (Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count += str.charAt(i);
                    i++;
                }
                if (Character.isLetter(str.charAt(i))) {
                    for (int j = 0; j < Integer.parseInt(count); j++) {
                        decoding += str.charAt(i);
                    }
                } else throw new RuntimeException("Input string did not pass validation!");
                count = "";
                i++;
            }
            else throw  new RuntimeException("Input string did not pass validation!");
        }
        return decoding;
    }

}

