package FailedTest.org;

import com.qa.Utility.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(listeners.iTestListener.class)
public class failedTest extends TestBase {
    WebDriver webdriver;
    Actions actions;
    SoftAssert softAssert;

    @Test
    public void chooseMarket(){
        webdriver=setupDriver();
        actions=new Actions(webdriver);
        WebElement findOurMarketLink=webdriver.findElement(By.linkText("FIND OUR MARKETS"));
        actions.moveToElement(findOurMarketLink).build().perform();
        String mStoreAddress=webdriver.findElement(By.cssSelector(".submenu.depth_0 > ul >li:nth-child(8)")).getText();
        softAssert.assertEquals(mStoreAddress,"Piscataway");
        actions.moveToElement((WebElement) By.cssSelector(".submenu.depth_0 > ul >li:nth-child(8)")).click().build().perform();
        //webdriver.findElement(By.cssSelector(".submenu.depth_0 > ul >li:nth-child(8)")).click();
        softAssert.assertAll();
    }

    @Test
    public void getPhone(){
        webdriver=setupDriver();
        String phnNo=webdriver.findElement(By.xpath("//p[contains(text(),'(732) - 356 – 4222')]")).getText();
        softAssert.assertEquals(phnNo,"732-912-7600");
        softAssert.assertAll();
    }


}
