package Hulu;

import Ebay.EbayHomePage;
import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoToHulu {
    private HuluHomePage huluHomePage;
    private WebDriver driver;

    @BeforeMethod
    public void setup (){

        driver = WebDriverFactory.createWebDriver();
        huluHomePage = PageFactory.initElements(driver, HuluHomePage.class);
    }

    @Test
    public void goToHuluHomePage() throws Exception {
        huluHomePage.goToHulu();
        Thread.sleep(5000);
        huluHomePage.fillOutLoginInfo();
        Thread.sleep(6000);
    }

    @AfterTest
    public void closeBrowser () {
        driver.quit();
    }
}
