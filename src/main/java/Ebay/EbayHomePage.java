package Ebay;

import Utilities.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePage {


   private WaitUtils waitUtils;
   private final WebDriver driver;

   public EbayHomePage(WebDriver driver) {
      this.driver = driver;
      this.waitUtils = new WaitUtils(driver);
   }

   // lets use ebay

    @FindBy (id = "thing")
    private WebElement name;

    @FindBy (id = "gh-ac")
    private WebElement searchBar;

   public void goToEbay() {
      toEbay();
   }


   private void toEbay() {

      driver.get("https://www.ebay.com/");

   }

   private void landOnEbay(){

   }

   private void clickIntoSearchMenu() {

   }

   public void enterSearchTerm(String term) {
      searchBar.sendKeys(term);
   }

   private void waitForTermToReturn() {

   }

   private void grabAllItemsOnFirstPage() {

   }


    
}
