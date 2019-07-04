package com.stackroute.exercise1;

public class Guess {
    public  String guess(int instance_num,int guess_num) {
        //guessing the given number
        //if the given number is equal to guessed number
        if (guess_num == instance_num) {
            return "Number guessed matches the original";
            //if given number is greater than guessed number
        } else if (guess_num > instance_num) {
            return "Number guessed is greater than the original";

        } else if (guess_num < instance_num) {
            return ("Number guessed less than the original");

        }

        return null;
    } // function guess
}
