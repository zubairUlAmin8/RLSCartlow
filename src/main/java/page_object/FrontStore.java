package page_object;


import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_factory.FrontStoreElements;

import java.time.Duration;


public class FrontStore extends BasePage {
    FrontStoreElements frontStoreElements= new FrontStoreElements(getDriver());
    Actions action = new Actions(getDriver());

    public void clickOnAddToCart(){
        frontStoreElements.addToCartButton.click();
    }
    public void clickOnCheckOutButton(){
        frontStoreElements.checkOutButton.click();
    }
    public void gotoCheckoutpageCartDropDrown()
    {
        action.moveToElement(frontStoreElements.cartIcon).perform();

        WebDriverWait t = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        t.until(ExpectedConditions.visibilityOf(frontStoreElements.viewCartItems));
        t.until(ExpectedConditions.elementToBeClickable(frontStoreElements.viewCartItems));
        action.moveToElement(frontStoreElements.viewCartItems).click().perform();

    }
}
