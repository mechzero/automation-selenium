import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver",
                "/Users/awa/Downloads/chromedriverFolder/chromedriver");

      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Enable headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        // Create a new instance of the ChromeDriver with headless options
        WebDriver driver = new ChromeDriver(options);

        // Perform automation tasks in headless mode
        System.out.println("TEST");

        // Close the browser
        driver.quit();
    }
}
