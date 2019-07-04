package com.stackroute.exercise1;

import java.util.Scanner;

public class UnspecificInput
{
    public static void main(String[] args){
        //a unspecified input is given and add the inputs
        Scanner scan=new Scanner(System.in);
        int sum=0;
        while (scan.hasNext() && (!("\n").equals(scan.hasNext()))) {
            sum = sum + scan.nextInt();

        }

        System.out.println(sum);
    }
}
