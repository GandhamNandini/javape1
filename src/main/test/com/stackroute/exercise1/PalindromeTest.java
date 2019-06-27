package com.stackroute.exercise1;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome p;
    @Before
    public void setUp(){
        p=new Palindrome();
    }
    @After
    public void tearDown(){
        p=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Started Execution");
    }
    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("All Executed Successfully");
    }

    @Test
    public void givenOneNumberShouldReturnMessage(){
        String result=p.isPalindrome(2334);
        assertEquals("Failure",result);
    }


    @Test
    public void givenZeroShouldReturnFailureMessage(){
        String result=p.isPalindrome(0);
        assertEquals("Failure",result);
    }

    @Test
    public void givenNumberShouldReturnMessage(){
        String result=p.isPalindrome(12221);
        assertEquals("Failure",result);
    }

    @Test
    public void givenPalindromeNumberShouldReturnMessage(){
        String result=p.isPalindrome(19991);
        assertEquals("Success",result);
    }

}