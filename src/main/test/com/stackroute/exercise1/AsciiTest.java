package com.stackroute.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AsciiTest {
    Ascii as;
    @Before
    public void setUp(){
        as=new Ascii();
    }
    @After
    public void tearDown(){
        as=null;
    }
    @Test
    public void givenCharacterShouldReturnType(){
        String result=as.findingCharacters('f');
        assertEquals("small letter",result);
    }

    @Test
    public void givenNumberShouldReturnDigit(){
        String result=as.findingCharacters('2');
        assertEquals("Digit",result);
    }

    @Test
    public void givenSpaceShouldReturnSpecialSymbol(){
        String result=as.findingCharacters(' ');
        assertEquals("Special Symbol",result);
    }

}