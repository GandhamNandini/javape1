package com.stackroute.exercise1;

public class Pattern
{
    public String  printPattern(int number){
        int j;
        int k=0;
        //condition for printing the pattern 122333 based on the given input
        String s1="";
        for (int i = 1; i <= number; i++) {
            for (j = 1; j <= i;j++ ) {
                s1=s1+i+" ";
            }
        }
        return s1;
    }
}
