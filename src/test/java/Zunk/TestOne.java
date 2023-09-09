package Zunk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {




    public static void main (String[] args){

       // System.setProperty("webdriver.chrome.driver", "/Users/awa/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver", "/Users/awa/Downloads/chromedriverFolder/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://staging.congacontracts.com/Contracts");

        sleepMethod(3000);

        driver.quit();

    }

    public static void sleepMethod ( int time){

        try{
            Thread.sleep(time);
        }
        catch (Exception e){
            // do nothing!
        }
    }


}
