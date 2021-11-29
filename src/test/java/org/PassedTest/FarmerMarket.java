package org.PassedTest;


import com.qa.Utility.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(listeners.iTestListener.class)
public class FarmerMarket extends TestBase {

    WebDriver webdriver;
    SoftAssert softAssert;

    @Test
    public void getTitle() {
        webdriver = setupDriver();
        String title = webdriver.getTitle();
        System.out.println(title);
    }

    @Test
    public void getHeader() {
        webdriver = setupDriver();
        webdriver.findElement(By.linkText("ABOUT US")).click();
        String header1 = webdriver.findElement(By.xpath("//h2[contains(text(),'The Farmers Market Group')]")).getText();
        Assert.assertEquals(header1, "The Farmers Market Group");
    }

    @Test
    public void failedTest1() {
        webdriver = setupDriver();
        String title = webdriver.getTitle();
        String expectedtitle = "Amrin";
        softAssert = new SoftAssert();
        softAssert.assertEquals(expectedtitle, title);
        softAssert.assertAll();
    }
}