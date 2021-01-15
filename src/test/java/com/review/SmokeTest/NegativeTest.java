package com.review.SmokeTest;

import com.review.utilities.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NegativeTest extends TestBase {


    @Test
    public void invalidPassword(){
        driver.get("http://www.kaolapalace-qa-environment2.com/Account/Logon");
        WebElement userID = driver.findElement(By.id("UserName"));
        userID.sendKeys("manager2");
        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("1234");
        WebElement login= driver.findElement(By.id("btnSubmit"));
        login.click();

        WebElement message= driver.findElement(By.id("divMessageResult"));
        System.out.println(message.getText());
        Assert.assertTrue(message.getText().contains("Wrong password"));

    }

    @Test
    public void invalidID(){

    }

    @Test
    public void invalidIDAndPassword(){

    }

}


