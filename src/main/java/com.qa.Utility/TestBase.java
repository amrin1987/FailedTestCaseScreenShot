package com.qa.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public  WebDriver webdriver;
    private String driverPath="C:\\Users\\wahid\\Documents\\chromedriver.exe";

    @BeforeMethod
    public void beofreMethod(){
        String heading=" Test Statrted";
        System.out.println(heading);
    }
    public WebDriver setupDriver(){
        System.setProperty("webdriver.chrome.driver",driverPath);
        webdriver=new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.get("https://thefarmersmarketgroup.com/");
        return webdriver;
    }

    @AfterMethod
    public void tearDown(){
        webdriver.quit();
        System.out.println("Test Ended");
    }


}
