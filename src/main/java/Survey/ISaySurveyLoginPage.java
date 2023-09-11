package Survey;

import LoginEngine.LoginEngine;
import Utilities.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ISaySurveyLoginPage {

    @FindBy (id = "edit-name")
    private WebElement loginEmailInput;

    @FindBy (id = "edit-pass")
    private WebElement loginPasswordInput;

    @FindBy (id = "edit-submit")
    private WebElement loginBtn;

    private String loginEmail = "marcus@marcusboykin.com";

    public String getLoginEmail() {
        return loginEmail;
    }

    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    private String loginPassword = "Dallas22!!";

    private WaitUtils waitUtils;
    private final WebDriver driver;
    Actions actions;
    LoginEngine loginEngine;

    public ISaySurveyLoginPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
        this.actions = new Actions(driver);
        this.loginEngine = new LoginEngine(driver);
    }

    public void goToURL(String url) {


        loginEngine.goToApplicationURL(url);


    }

    public void login() {
        loginEngine.loginEngine(loginEmail,loginPassword,loginEmailInput,loginPasswordInput,loginBtn);
    }




}
