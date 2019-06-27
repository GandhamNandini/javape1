package com.stackroute.exercise1;

public class Guess {
    public  String guess(int instance_num,int guess_num) {

        if (guess_num == instance_num) {
            return "Number guessed matches the original";
        } else if (guess_num > instance_num) {
            return "Number guessed is greater than the original";

        } else if (guess_num < instance_num) {
            return ("Number guessed less than the original");

        }

        return null;
    } // function guess
}
