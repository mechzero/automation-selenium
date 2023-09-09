package Zunk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class TestThree {


    @BeforeMethod
    public void driverSetup () {

        // System.setProperty("webdriver.chrome.driver", "/Users/awa/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver", "/Users/awa/Downloads/chromedriverFolder/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://staging.congacontracts.com/Contracts");

        try {
            Thread.sleep(3000);
        }
        catch (Exception e)
        { // do nothing
             }
            close(driver);

    }



    @AfterClass
    public void close(WebDriver driver) {
        driver.quit();
    }



}

