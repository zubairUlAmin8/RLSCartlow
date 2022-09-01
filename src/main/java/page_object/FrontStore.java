package page_object;


import Utils.utility;
import Utils.waits;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_factory.FrontStoreElements;

import java.io.IOException;
import java.time.Duration;


public class FrontStore extends BasePage {
    FrontStoreElements frontStoreElements= new FrontStoreElements(getDriver());
    Actions action = new Actions(getDriver());

    public void clickOnAddToCart(){
        frontStoreElements.addToCartButton.click();
    }
    public void clickOnCheckOutButton(){
//        frontStoreElements.checkOutButton.click();

        boolean staleElement = true;
        WebDriver driver=getDriver();

        while(staleElement){

            try{

                driver.findElement(By.xpath("//*[@id=\"cart-container\"]/div/div/aside/section/div/a")).click();

                staleElement = false;


            } catch(StaleElementReferenceException e){

                staleElement = true;

            }

        }
    }
    public void  enterUserEmailAddress() throws IOException {
        String userEmail= utility.getValue("userEmail");
      waits.sendKeys(getDriver(), frontStoreElements.userEmail, userEmail,30);
    }

    public void  enterUserPassword() throws IOException {
        String userPassword= utility.getValue("userPassword");
      waits.sendKeys(getDriver(), frontStoreElements.userPassword, userPassword,30);
    }

  public void  clickOnSignInButton() {
      frontStoreElements.signInButton.click();
    }

    public void viewCartItemsItemsDropDown()
    {
        action.moveToElement(frontStoreElements.cartIcon).perform();

        WebDriverWait t = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        t.until(ExpectedConditions.visibilityOf(frontStoreElements.viewCartItems));
        t.until(ExpectedConditions.elementToBeClickable(frontStoreElements.viewCartItems));
        action.moveToElement(frontStoreElements.viewCartItems).click().perform();

    }

    public void cashOnDeliveryRadioSelect(){
        frontStoreElements.cashOnDeliveryRadio.click();

    }

    public void placeOrderButton(){
//        frontStoreElements.placeOrderButton.click();


        boolean staleElement = true;
        WebDriver driver=getDriver();

        while(staleElement){

            try{

                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[3]/section/div[2]/a")).click();

                staleElement = false;


            } catch(StaleElementReferenceException e){

                staleElement = true;

            }

        }

    }
}
