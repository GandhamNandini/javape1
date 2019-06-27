package com.stackroute.exercise1;

public class Ascii {
    public String findingCharacters(char character){

        if(character>=65 && character<=90){
            return "Capital letter";
        }

        else if(character>=97 && character<=122){
            return "small letter";
        }

        else if(character>=48 && character<=57){
            return "Digit";
        }
        else{
            return "Special Symbol";
        }
    }
}
