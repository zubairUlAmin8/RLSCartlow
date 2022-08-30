package page_factory;

import object_repo.ReturnManageSystemOR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ReturnManageSystemElements {
    WebDriver driver;
    public ReturnManageSystemElements(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = ReturnManageSystemOR.rmaHeader)
    public WebElement rmaHeader;
}
