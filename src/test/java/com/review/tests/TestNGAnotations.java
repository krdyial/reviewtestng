package com.review.tests;

import org.junit.Ignore;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGAnotations {

    @BeforeMethod
    public void setUp(){
        System.out.println("This is Before Method");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("This is after method");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    @Ignore
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }
    @Test
    public void test4(){
        System.out.println("test4");
    }
}
