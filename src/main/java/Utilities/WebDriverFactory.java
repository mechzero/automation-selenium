//package Utilities;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class WebDriverFactory {
////    public static WebDriver createWebDriver() {
////        System.setProperty("webdriver.chrome.driver", "/Users/awa/Downloads/chromedriverFolder/chromedriver");
////        WebDriver driver = new ChromeDriver();
////        return driver;
////    }
//
//    public static WebDriver createWebDriver() {
//        System.setProperty("webdriver.chrome.driver",
//                "/Users/awa/Downloads/chromedriverFolder/chromedriver");
//
//        WebDriver driver = new ChromeDriver();
//
//        // Enable headless mode
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//
//        return driver;
//    }
//}


package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {
    public static WebDriver createWebDriver() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/awa/Downloads/chromedriverFolder/chromedriver");

        // Enable headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);
        return driver;
    }
}
