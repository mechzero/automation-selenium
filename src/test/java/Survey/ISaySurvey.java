package Survey;

import LoginEngine.LoginEngine;
import Netflix.NetflixSignInPage;
import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ISaySurvey {

    private ISaySurveyPage iSaySurveyPage;
    private ISaySurveyLoginPage iSaySurveyLoginPage;
    private LoginEngine loginEngine;
    private WebDriver driver;

    private String searchTerm;


    private String loginURL2 =
            "https://www.ipsosisay.com/en-us/user/login";

    @BeforeMethod
    public void setup (){

        driver = WebDriverFactory.createWebDriver();

        iSaySurveyPage = PageFactory.initElements(driver, ISaySurveyPage.class);
        iSaySurveyLoginPage = PageFactory.initElements(driver, ISaySurveyLoginPage.class);

    }

    @Test
    public void test() {

        iSaySurveyLoginPage.goToURL(loginURL2);
        iSaySurveyLoginPage.login();

    }


    @AfterTest
    public void closeBrowser () {
        driver.quit();
    }


}
