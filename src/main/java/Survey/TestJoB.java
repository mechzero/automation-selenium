//package com.codility.selenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//import org.junit.Test;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertEquals;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.testng.Assert;
//
//public class AppTest extends BaseTest {
//
//
//    private final String validEmail = "login@codility.com";
//    private final String wrongEmail = "unknown@codility.com";
//    private final String incompleteEmail = "unknownlogin";
//
//    // get password from properties file, or git hub key.
//    private final String password = "password";
//
//
//
//
//    public void useWebElements(String login, String pass) {
//
//        WebElement emailInputField = webDriver.findElement(By.id("email-input"));
//        WebElement password = webDriver.findElement(By.id("password-input"));
//        WebElement loginBtn = webDriver.findElement(By.id("login-button"));
//
//        emailInputField.sendKeys(validEmail);
//
//
//
//    }
//
//    public WebElement loginInputField() {
//
//        return webDriver.findElement(By.id("email-input"));
//    }
//
//    public WebElement passwordInputField() {
//
//        return webDriver.findElement(By.id("password-input"));
//    }
//
//    public WebElement loginBtn() {
//
//        return webDriver.findElement(By.id("login-button"));
//    }
//
//
//
//
//
//    @Test (priority = 0)
//    public void assertFieldsAreDisplayed(){
//
//        Assert.assertTrue(loginInputField.isDisplayed());
//        Assert.assertTrue(passwordInputField.isDisplayed());
//        Assert.assertTrue(loginBtn.isDisplayed());
//
//    }
//
//
//    @Test (priority= 1)
//    public void credentialsValid(){
//
//        loginWithProvidedCredentials(validEmail,password);
//
//        Assert.assertTrue(loginSuccessful());
//
//    }
//
//    @Test(priority= 2)
//    public void credentialsWrong(){
//        loginWithProvidedCredentials(wrongEmail,password);
//
//        Assert.assertTrue(wrongCredentialsYouShallNotPassArrDisplayed());
//
//    }
//
//    @Test(priority= 3)
//    public void checkIfEmailValidationWorking() {
//        loginWithProvidedCredentials(incompleteEmail,password);
//        Assert.assertTrue(enterValidEmailDisplayed());
//
//    }
//
//    @Test(priority = 4)
//    public void checkEmptyCredentials() {
//
//        String textWithinLoginField = loginInputField().getText();
//        String textWithinPasswordField = passwordInputField().getText();
//
//
//        Assert.assertEquals(textWithinLoginField, "");
//        Assert.assertEquals(textWithinPasswordField, "")
//
//
//    }
//
//
//
//
//    public void loginWithProvidedCredentials(String email, String pass) {
//        loginInputField.sendKeys(validEmail);
//        passwordInputField.sendKeys(password);
//        loginBtn.click();
//    }
//
//
//    public boolean loginSuccessful() {
//        WebElement welcomeToCodility = webDriver.findElement(By.class("success"));
//        return welcomeToCodility.isDisplayed();
//    }
//
//    public boolean wrongCredentialsYouShallNotPassArrDisplayed(){
//        WebElement youShallNotPassArrr = webDriver.findElement(By.class("error"));
//        return youShallNotPassArrr.isDisplayed();
//    }
//
//    public boolean enterValidEmailDisplayed(){
//        WebElement enterValidEmailMessage = webDriver.findElement(By.class("validation"));
//        return enterValidEmailMessage.isDisplayed();
//
//    }
//
//
//
//    /*
//    ========= TEST CASES ======
//
//    0) Assert if id's are found
//    1) Check if given valid credentials work
//    2) Check if given wrong credentials work
//    3) Check if email validation is working
//    4) check if fields are empty
//
//
//
//
//
//    */
//
//
//    // POM, LoginPage.java
//    // @FindBy (id ="email-input")
//    // final private WebElement emailInputField;
//
//    // @FindBy (id="password-input")
//    // final private WebElement passwordInputField;
//
//    // @FindBy(id = "login-button")
//    // final private WebElement loginBtn;
//
//
//
//
//}
