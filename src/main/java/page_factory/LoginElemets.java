package page_factory;

import object_repo.OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElemets {
    WebDriver driver;
    public LoginElemets(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = OR.userName)
    public WebElement userName;

    @FindBy(name = OR.password)
    public WebElement password;

    @FindBy(id = OR.continueButton)
    public WebElement continueButton;

}
