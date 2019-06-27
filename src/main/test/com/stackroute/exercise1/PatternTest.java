package com.stackroute.exercise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
    Pattern p;
    @Before
    public void setUp(){
        p=new Pattern();
    }
    @Test
    public void givenNumberShouldReturnPattern(){
        String result=p.printPattern(2);
        assertEquals("1 2 2",result.trim());
    }
    @Test
    public void givenZeroShouldReturn(){
        String result=p.printPattern(0);
        assertEquals("",result);
    }

}