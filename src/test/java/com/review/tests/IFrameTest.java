package com.review.tests;

import com.review.utilities.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrameTest extends TestBase {

    @Test
    public void iFrameTest(){
//    Go to https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");
        //    Verify the Bolded text contains “Editor”
        WebElement boldedText= driver.findElement(By.xpath("//h3"));
        String bold = boldedText.getText();
        Assert.assertTrue(bold.contains("Editor"));
        driver.switchTo().frame(0);



        //    Locate the text box
        WebElement textBoxElement= driver.findElement(By.xpath("//p"));
        //    Delete the text in the text box
        textBoxElement.clear();
        //    Type “This text box is inside the iframe”
        textBoxElement.sendKeys("This text box is inside the iframe");
        //    Verify the text Elemental Selenium text is displayed on the page

        WebElement element = driver.findElement(By.linkText("Elemental Selenium"));
        String elementText = element.getText();
        Assert.assertTrue(element.isDisplayed());




    }








}
