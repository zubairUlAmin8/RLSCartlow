package page_factory;

import object_repo.FrontStoreOR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontStoreElements {
    WebDriver driver;

    public FrontStoreElements(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = FrontStoreOR.addToCartButton)
    public WebElement addToCartButton;
    @FindBy(xpath = FrontStoreOR.viewCartItems)
    public WebElement viewCartItems;
    @FindBy(xpath = FrontStoreOR.cartIcon)
    public WebElement cartIcon;
    @FindBy(xpath = FrontStoreOR.checkOutButton)
    public WebElement checkOutButton;

    @FindBy(xpath = FrontStoreOR.userEmail)
    public WebElement userEmail;

    @FindBy(xpath = FrontStoreOR.userPassword)
    public WebElement userPassword;

    @FindBy(id = FrontStoreOR.signInButton)
    public WebElement signInButton;


}
