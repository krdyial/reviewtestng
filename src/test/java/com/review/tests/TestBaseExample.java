package com.review.tests;

import com.review.utilities.TestBase;
import org.testng.annotations.Test;

public class TestBaseExample extends TestBase {

    @Test
    public void test1(){
        driver.get("https://www.google.com");
    }

}