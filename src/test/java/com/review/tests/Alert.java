package com.review.tests;

import com.review.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alert {
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void acceptAlert(){

        WebElement firstAlert= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        firstAlert.click();
        driver.switchTo().alert().accept();
    }

    @Test(groups = "asd")
    public void getText(){
        WebElement secondAlert = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        secondAlert.click();
        System.out.println(driver.switchTo().alert().getText());
    }

    @Test
    public void dismissAlert(){
        WebElement thirdAlert= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        thirdAlert.click();
        driver.switchTo().alert().sendKeys("I will work as a Tester");
        driver.switchTo().alert().accept();
        WebElement result = driver.findElement(By.id("result"));
        Assert.assertTrue(result.getText().equals("You entered: I will work as a Tester"));
    }
}
