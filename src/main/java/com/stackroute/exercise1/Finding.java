package com.stackroute.exercise1;

public class Finding {

    public  String vowelConsonant(String s)
    {
        String result="";
        for(int i=0;i<s.length();i++)
        {
            char  c=s.charAt(i);
            //To check it the given string has alphabets or not
            if( (c >= 'a' && c<= 'z') || (c >= 'A' && c<= 'Z'))
            {
                //if alphabets check if they are vowels else consonants
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||
                        c=='I'||c=='O'||c=='U')
                {
                    result+= "Vowels";
                }
                else
                {
                    result+= "Consonants";
                }

            }
            else
            {
                result+="Error";
            }

        }
        return result;
    }
}
