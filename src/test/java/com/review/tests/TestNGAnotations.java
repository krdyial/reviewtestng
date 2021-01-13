package com.review.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class TestNGAnotations {

    @BeforeMethod
    public void setUp(){
        System.out.println("This is Before Method");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("This is after method");
    }

    @Test(priority = 4-10)
    public void test5(){
        System.out.println("test1");
    }
    @Test
    @Ignore
    public void test2(){
        System.out.println("test2");
    }
    @Test(priority = 6)
    public void test3(){
        System.out.println("test3");
    }
    @Test(priority = 1)
    public void test4(){
        System.out.println("test4");
    }
}
