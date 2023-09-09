package Hulu;

import Utilities.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HuluHomePage {

    private WaitUtils waitUtils;
    private final WebDriver driver;
    Actions actions;



    private String huluLoginUrl = "https://www.hulu.com/my-stuff";
    private String login = "miamoriadore@gmail.com";
private String password = "Mboykin1048";


@FindBy (className = "cu-search-input")
private WebElement searchBar;

@FindBy (className = "ListItem__content")
private WebElement resultsRowClass;

@FindBy (xpath = "//input[@type='text']")
private WebElement  loginInput;

@FindBy (xpath = "//input[@type='password']")
private WebElement  passwordInput;

    @FindBy (xpath = "//button[@type='button']")
    private WebElement  loginButton;

    @FindBy (className = "login-button")
    private WebElement loginBtn;

    public HuluHomePage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
        this.actions = new Actions(driver);
    }

// go to hulu
    // login
    // select profile
    // search for it

    public void goToHulu() {
        waitSeconds(5);
        driver.get(huluLoginUrl);
    }

    public void fillOutLoginInfo() {
        loginInput.sendKeys(login);
        waitSeconds(3);
        passwordInput.sendKeys(password);
        waitSeconds(4);
     //  actions.click(loginBtn).perform();
        actions.click(loginButton).perform();
        waitSeconds(60);
    }



    public void waitSeconds (int seconds) {

        int s = 1000 * seconds;
        try{Thread.sleep(s);}
        catch(Exception e) {
            System.out.println("Waiting");
        }

    }






}
