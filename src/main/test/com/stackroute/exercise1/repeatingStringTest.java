package com.stackroute.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class repeatingStringTest {
    repeatingString rs;
    @Before
    public void setUp(){
        rs=new repeatingString();
    }
    @After
    public void tearDown(){
        rs=null;
    }
    @Test
    public void givenStringIntegerShouldReturnRepeatedOutput(){
        String result=rs.repeatString("sraddhareddy",5);
        assertEquals("sraddhareddyreddyreddyreddyreddyreddy",result);

    }

    @Test
    public void givenStringIntegerShouldReturnOutput(){
        String result=rs.repeatString("sra",4);
        assertEquals("String index out of range","input2 should be less than length of input1",result);

    }

}