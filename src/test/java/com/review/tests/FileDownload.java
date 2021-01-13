package com.review.tests;

import com.review.utilities.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownload extends TestBase {


//    downloadTest()
//    In the downloadTest() method, do the following test:
//    Go to https://the-internet.herokuapp.com/download
//    Download webdriverIO.png file
//    Then verify if the file downloaded successfully


    @Test
    public void downloadTest(){
        driver.get("https://the-internet.herokuapp.com/download");
        WebElement fileToDownload= driver.findElement(By.linkText("webdriverIO.png"));
        fileToDownload.click();
        String pathOfFile= "C:\\Users\\UXU\\Downloads\\webdriverIO.png";
        boolean isExists= Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(isExists);

    }
}
