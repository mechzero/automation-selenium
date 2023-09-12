package LoginEngine;

import Utilities.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class LoginEngine {

    private WaitUtils waitUtils;
    private final WebDriver driver;
    Actions actions;



    public LoginEngine(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
        this.actions = new Actions(driver);
    }

    public void goToApplicationURL(String url) {
        waitSeconds(5);
        driver.get(url);

    }

    // uns, pws, web, web, web
    public void loginEngine(String username,
                            String password,
                            WebElement loginInput,
                            WebElement passwordInput,
                            WebElement loginButton)
    {
        loginInput.sendKeys(username);
        waitSeconds(3);
        passwordInput.sendKeys(password);
        waitSeconds(4);
        actions.click(loginButton).perform();
        waitSeconds(10);


        test().click();
        test().sendKeys("");


    }

    public WebElement test () {

        return driver.findElement(By.id("marcus"));
    }


    public void waitSeconds (int seconds) {

        int s = 1000 * seconds;
        try{Thread.sleep(s);}
        catch(Exception e) {
            System.out.println("Waiting");
        }

    }




}
