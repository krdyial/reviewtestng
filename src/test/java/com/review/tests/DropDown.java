package com.review.tests;

import com.review.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {
//Create a class name : DropDown
//Go to https://the-internet.herokuapp.com/dropdown
//1.Select and Print Option 1 using index
//2.Select and Print Option 2 by value
//3.Select and Print default value by visible text
//4.Print all dropdown values
//5.Find the size of the dropdown, Print true if there are 4 elements in the dropdown. Print false otherwise.
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dropdown");

    }

    @Test
    public void dropdownTest(){
        WebElement dropdowneElement=driver.findElement(By.id("dropdown"));
        Select select= new Select(dropdowneElement);
        select.selectByIndex(1);



    }
    @Test(groups = "asd")
    public void printDropdownMenu(){
        //Print all dropdown values
        WebElement dropdowneElement= driver.findElement(By.id("dropdown"));
        Select select= new Select(dropdowneElement);
        List<WebElement>  allOptions= select.getOptions();
        for (WebElement e: allOptions){
            System.out.println(e.getText());
        }
        

    }
}
