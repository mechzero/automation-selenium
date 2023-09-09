package Netflix;

import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;

public class GoToNetflix {

    private NetflixSignInPage netflixSignInPage;
    private WebDriver driver;

    private String searchTerm;

    private String loginURL =
            "https://www.netflix.com/Login";

    @BeforeMethod
    public void setup (){

        driver = WebDriverFactory.createWebDriver();

        netflixSignInPage = PageFactory.initElements(driver, NetflixSignInPage.class);

    }

    @Test
    public void GoToNetflixSignInPage() throws Exception {

        whatDoYouWantToSearchFor();

        netflixSignInPage.goToNetflix(loginURL);
        netflixSignInPage.fillOutLoginInfo();
        netflixSignInPage.clickSubmit();
       // netflixSignInPage.waitSeconds(5);
        netflixSignInPage.selectProfile();
        Assert.assertEquals(actualProfileFound(),expectedProfileFound());
        Assert.assertTrue(searchInputDisplayed());
       // netflixSignInPage.waitSeconds(5);

       // netflixSignInPage.switchFrames();

        netflixSignInPage.clickMagnifyingGlass();

        netflixSignInPage.performSearch(encodedStringInput());
        netflixSignInPage.waitSeconds(5);
        netflixSignInPage.handleList();
       // netflixSignInPage.waitSeconds(5);

    }

    public boolean searchInputDisplayed() {

        return true;
    }

    public String whatDoYouWantToSearchFor() throws UnsupportedEncodingException {

      String inputString = "Ice Age";

        this.searchTerm = inputString;

        return inputString;
    }

    public String actualProfileFound() {
        return "actual";
    }

    public String expectedProfileFound() {
        return "expected";
    }

    public String encodedStringInput() throws UnsupportedEncodingException {

        String encodedString = URLEncoder.encode(searchTerm, "UTF-8");


        return encodedString;
    }


    @AfterTest
    public void closeBrowser () {
        driver.quit();
    }
}
