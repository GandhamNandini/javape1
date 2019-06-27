package com.stackroute.exercise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddNumberTest {
    OddNumber od;
    @Before
    public void setUp(){
        od=new OddNumber();
    }

    @Test
    public void givenNumberShouldReturnMessage(){
        String result=od.checkOdd(25);
        assertEquals("Tom",result);
    }

    @Test
    public void givenNumberShouldReturnJerryMessage(){
        String result=od.checkOdd(26);
        assertEquals("Jerry",result);
    }

    @Test
    public void givenNumberShouldReturnNoneMessage(){
        String result=od.checkOdd(125);
        assertEquals("none",result);
    }

    @Test
    public void givenNumberZeroShouldReturnMessage(){
        String result=od.checkOdd(0);
        assertEquals("none",result);
    }

}