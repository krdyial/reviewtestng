package com.review.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

    //create a public static method to instantiate(call ) the driver

    public static WebDriver getDriver(){
        if(driver==null){

            switch (ConfigReader.getProperty("browser")){
                case"chrome":
                    WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
                case"edge":
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            break;

            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }

    public static void tearDown(){

        if(driver!=null){
            driver.quit();
        }
        driver=null;

    }




}
