package com.stackroute.exercise1;

public class Ascii {
    public String findingCharacters(char character){
        //range of capital letter
        if(character>=65 && character<=90){
            return "Capital letter";
        }
        //range of small letters
        else if(character>=97 && character<=122){
            return "small letter";
        }
        //range of digits
        else if(character>=48 && character<=57){
            return "Digit";
        }
        else{
            return "Special Symbol";
        }
    }
}
