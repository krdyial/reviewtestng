package com.review.tests;

import com.review.utilities.TestBase;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Set;

public class WindowHandle extends TestBase {
//    Create a new Class Tests package: WindowHandleExample
//    Given user is on the https://the-internet.herokuapp.com/windows
//    Then user verifies the text : “Opening a new window”
//    Then user verifies the title of the page is “The Internet”
//    When user clicks on the “Click Here” button
//    Then user verifies the new window title is “New Window”
//    Then user verifies the text:  “New Window”
//    When user goes back to the previous window and then verifies the title : “The Internet”
    @Test
    public void newWindowTest(){
        driver.get("https://the-internet.herokuapp.com/windows");
        String text1 = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("Opening a new window", text1);
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("The Internet"));
        //    When user clicks on the “Click Here” button

        WebElement clickHere= driver.findElement(By.linkText("Click Here"));
        clickHere.click();
        String defaultWindow= driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for(String e: allWindows){
            if(!e.equals(defaultWindow)){
                driver.switchTo().window(e);
            }
        }

        System.out.println(driver.getTitle());
        driver.switchTo().window(defaultWindow);
        System.out.println(driver.getTitle());





    }

}
