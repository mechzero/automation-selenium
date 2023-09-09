package Ebay;

import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoToEbay {

    private EbayHomePage ebayHomePage;
    private WebDriver driver;

    @BeforeMethod
    public void setup (){

        driver = WebDriverFactory.createWebDriver();
        ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);

    }

    @Test
    public void GoToEbayHomePage() throws Exception {
        ebayHomePage.goToEbay();
        Thread.sleep(5000);
        ebayHomePage.enterSearchTerm("LS3");
    }

    @AfterTest
    public void closeBrowser () {
        driver.quit();
    }
}
