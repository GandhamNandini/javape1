package com.stackroute.exercise1;

public class Palindrome {
    public String isPalindrome(int number) {
        int temp;
        String s1="Success";
        String s2="Failure";
        int add = 0;
        temp = number;
        int sum = 0;
        while (number > 0) {
            int reminder = number % 10;
            number = number / 10;
            sum = sum * 10 + reminder;
            if (reminder % 2 == 0) {
                add = add + reminder;
            }
        }
        if (sum == temp) {
            if (add > 25) {
                return s1;
            } else {
                return s2;
            }
        } else {
            return s2;
        }
    }
}
