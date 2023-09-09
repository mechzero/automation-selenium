package Netflix;

import Utilities.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.security.Key;
import java.util.List;

public class NetflixSignInPage {

    private WaitUtils waitUtils;
    private final WebDriver driver;
    Actions actions;

    private String login = "marcusboykin@gmail.com";
    private String password = "dallas";

    private String loginURL =
            "https://www.netflix.com/Login";

    @FindBy (id="id_userLoginId")
    private WebElement loginInput;

    @FindBy (id="id_password")
    private WebElement passwordInput;

    @FindBy (className="login-button")
    private WebElement loginButton;

    @FindBy (xpath = "//span[@class='profile-name' and text()='Marcus']")
    private WebElement  profileName;

    @FindBy (id = "searchInput")
    private WebElement searchField;


    @FindBy (className= "search-icon")
    private WebElement magnifyingGlass;

    @FindBy (className = "fallback-text")
    private WebElement text;


    @FindBy (id = "title-card-0-0")
    private WebElement firstTitleCard;

    @FindBy (className = "title-card")
    private WebElement classNameOfAllTitleCards;





    public NetflixSignInPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
        this.actions = new Actions(driver);
    }

    public void goToNetflix(String loginURL) {
        driver.get(loginURL);
        waitSeconds(5);
    }

    public void fillOutLoginInfo() {
        loginInput.sendKeys(login);

        passwordInput.sendKeys(password);
    }

    public void clickSubmit() {
        actions.click(loginButton).perform();
    }

    public void selectProfile() {
       // waitSeconds(4);
        profileName.click();
        System.out.println("Profile Click");
    }

    public void switchFrames() {
        driver.switchTo().frame(0);
    }

    public void clickMagnifyingGlass() {
        waitSeconds(2);
        actions.click(magnifyingGlass).perform();
        System.out.println("Clicked Magnifying Glass");
        waitSeconds(2);
    }

    public void performSearch(String searchTerm) {
       // waitSeconds(2);
        System.out.println("Search for: " + searchTerm);
        //searchField.sendKeys("Extraction 2");
        actions.sendKeys(searchField,searchTerm).perform();
        actions.sendKeys(searchField, Keys.ENTER).perform();
        System.out.println("Clicked Enter");
       // waitSeconds(2);
    }




    public void handleList () {
        // Find all elements with class name "fallback-text"
       // List<WebElement> elements = driver.findElements(By.className("fallback-text"));
        List<WebElement> elements = driver.findElements(By.className("title-card"));


        // Iterate through the elements and retrieve the text
        for (WebElement element : elements) {
            String text = element.getText();
            System.out.println("=====BEGIN TEXT=====");
            System.out.println(text);
            System.out.println("=====END TEXT=====");
        }

        System.out.println("=======now check the first card text =====");
        System.out.println("First Title Card Text: "+firstTitleCard.getText());
        System.out.println("=======now check the first card text =====");

    }
    public void waitSeconds (int seconds) {

        int s = 1000 * seconds;
        try{Thread.sleep(s);}
        catch(Exception e) {
            System.out.println("Waiting");
        }

    }


}


