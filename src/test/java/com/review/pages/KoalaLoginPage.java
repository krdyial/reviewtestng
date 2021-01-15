package com.review.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KoalaLoginPage {
    WebDriver driver;
    public KoalaLoginPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Log in")
    public WebElement loginButton1;

    @FindBy(id="UserName")
    public WebElement usernameBox;

    @FindBy(id="Password")
    public WebElement  passwordBox;

    @FindBy(id="btnSubmit")
    public WebElement loginButton2;

    @FindBy(xpath ="//span[@class='username username-hide-on-mobile']")
    public WebElement userName;

}
