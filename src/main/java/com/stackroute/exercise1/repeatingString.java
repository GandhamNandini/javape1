package com.stackroute.exercise1;

public class repeatingString {
    public String repeatString(String input1, int input2) {
        int len = input1.length();
        int i, j;
        String str = "";
        if (input2 < len) {
            //if given input is less than length of string then repeat the string
            for (i = len - input2; i <= (len - 1); i++) {
                str = str + input1.charAt(i);
            }
            for (j = 1; j <= input2; j++) {
                input1 = input1 + str;
            }
            return input1;
        } else {
            return "input2 should be less than length of input1";
        }
    }
}
