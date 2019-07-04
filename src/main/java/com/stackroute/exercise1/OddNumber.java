package com.stackroute.exercise1;

public class OddNumber {
    public String checkOdd(int number) {
        String s1="Tom";
        String s2="Jerry";
        //if number is odd then print tom
        if (number % 2 != 0) {
            if (number > 20 && number < 30) {
                return s1;
            }
        }
        //else then print jerry

        else {
            if (number > 20 && number < 30) {
                return s2;
            }
        }
        return "none";
    }
}
