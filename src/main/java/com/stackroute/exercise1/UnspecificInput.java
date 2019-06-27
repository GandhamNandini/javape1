package com.stackroute.exercise1;

public class UnspecificInput
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int sum=0;
        while (scan.hasNext() && (!("\n").equals(scan.hasNext()))) {
            sum = sum + scan.nextInt();

        }

        System.out.println(sum);
    }
}
