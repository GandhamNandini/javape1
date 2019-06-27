package com.stackroute.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindingTest {
    Finding app;

    @Before
    public void setUp() {
        app = new Finding();
    }

    @After
    public void teardown() {
        app = null;
    }

    @Test
    public void givenTwoStringShouldVowels() {
        //arrange

        //act
        String result = app.vowelConsonant("nan");
        //assert
        assertEquals("ConsonantsVowelsConsonants", result);
    }
    @Test
    public void givenCharacterShouldReturnError(){
        String result=app.vowelConsonant("#");
        assertEquals("Error",result);
    }

}