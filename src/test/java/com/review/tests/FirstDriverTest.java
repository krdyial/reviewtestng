package com.review.tests;

import com.review.pages.KoalaLoginPage;
import com.review.utilities.ConfigReader;
import com.review.utilities.Driver;
import org.testng.annotations.Test;

public class FirstDriverTest {
        KoalaLoginPage koalaLoginPage;
//    When user goes to the application http://www.kaolapalace-qa-environment2.com/
//    And click on the Login button
//    Then verify user is able to log in
    @Test
    public void firstDriverTest(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        koalaLoginPage= new KoalaLoginPage(Driver.getDriver());
        koalaLoginPage.loginButton1.click();
        koalaLoginPage.usernameBox.sendKeys(ConfigReader.getProperty("user"));
        koalaLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("pass"));
        koalaLoginPage.loginButton2.click();
        Driver.tearDown();


    }


}
