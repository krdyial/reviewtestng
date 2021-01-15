package com.review.tests;

import com.review.pages.KoalaLoginPage;
import com.review.utilities.ConfigReader;
import com.review.utilities.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import javax.security.auth.login.Configuration;

public class KoalaPalace extends TestBase {
    KoalaLoginPage obj;

    @Test
    public void loginPage() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        obj= new KoalaLoginPage(driver);
        obj.loginButton1.click();
        obj.usernameBox.sendKeys(ConfigReader.getProperty("user"));
        obj.passwordBox.sendKeys(ConfigReader.getProperty("pass"));
        obj.loginButton2.click();
        Thread.sleep(5000);
        Assert.assertTrue(obj.userName.getText().contains("Mike"));

    }
}
