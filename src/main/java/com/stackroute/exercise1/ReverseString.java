package com.stackroute.exercise1;

public class ReverseString
{
    public String stringReverse(String original){
        String reverse="";
        //to print the reverse of a string
        int length=original.length();
        for(int i=length-1;i>=0;i--){
            char ch=original.charAt(i);
            reverse=reverse + ch;
        }
        return reverse;
    }
}
